package practise;

/*
 * 3.�����ַ����������ͬ���Ӵ�
 * "qwerabcdtyuiop"
 * "xabcdvbn"
 * 
 * ˼�룺
 * 1.ȡ����ַ������ȿ��̵��ַ����Ƿ��ڳ����ַ�����
 * ������ڣ��̵��Ǹ��ַ�����������ַ���
 * 2.������ǣ��ͽ��̵��Ӵ����г��ȵݼ��ķ�ʽȥ�Ӵ������ڳ������ж��Ƿ����
 * ������ھ��ҵ��ˣ�
 * */
public class StringPractise3 {
	public static void main(String[] args) {
		String s1 = "qwerabcdtyuiop";
		String s2 = "xabcdvbn";

		String s = getMaxSubstring(s1, s2);
		System.out.println("s=" + s);
	}

	public static String getMaxSubstring(String s1, String s2) {
		for (int i = 0; i < s2.length(); i++) {
			for (int a = 0, b = s2.length() - i; b != s2.length() + 1; a++, b++) {
				String sub = s2.substring(a, b);
				//System.out.println(sub);//��ӡ�õ��ַ�������С���ӣ�
				if(s1.contains(sub))
					return sub;
			}
		}
		return null;
	}
}
