package practise;

/*һ���Ӵ��������г��ֵĴ���
 * "nbaernbatynbauinbaopnba"
 * 
 * ˼·��
 * 1.Ҫ�ҵ��Ӵ��Ƿ���ڣ�������ڻ�ȡ����ֵ�λ�á���indexOf
 * 2.�ҵ��ˣ���¼���ֵ�λ�ò���ʣ����ַ����м������Ҹ��Ӵ���
 * ��ʣ���ַ�������ʼλ���ǳ���λ��+�Ӵ��ĳ��ȡ�
 * 3.�Դ����ƣ�ͨ��ѭ����ɲ��ң�����Ҳ�������-1��
 * ����iÿ���ҵ��ü�������¼
 * */
public class StringPractise2 {
	public static void main(String[] args) {
		String str = "nbaernbatynbauinbaopnba";
		String key = "nba";

		int count = getKeyStringCount(str, key);
		System.out.println("count=" + count);

	}

	public static int getKeyStringCount(String str, String key) {
		// 1.���������
		int count = 0;
		// 2.�����������¼key���ֵ�λ��
		int index = 0;

		while ((index = str.indexOf(key)) != -1) {
			str = str.substring(index + key.length());
			count++;
		}
		return count;
	}
}
