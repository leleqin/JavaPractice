package practise;
/*
 * 4.ģ��һ��trim����һ�µķ���.ȥ���ַ������˵Ŀհ�
 * 
 * ˼·
 * 1.������������
 * һ����Ϊ��ͷ��ʼ�ж��ַ����ո�ĽǱꡣstart++
 * һ����Ϊ��β��ʼ�ж��ַ����ո�ĽǱꡣend--
 * 2.�жϵ����ǿո�Ϊֹ��ȥͷβ֮����ַ�������
 * */
public class StringPractise4 {

	public static void main(String[] args) {
		String s = "   ab  c   ";
		s = myTrim(s);
		System.out.println("-" + s + "-");
	}
	public static String myTrim(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start <= end && s.charAt(start) == ' ') {
			start++;
		}
		while (start <= end && s.charAt(end) == ' ') {
			end--;
		}
		return s.substring(start, end + 1);
	}
}
