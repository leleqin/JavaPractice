package practise;

/*1.����һ���ַ������飬�����ֵ�˳����д�С���������
{"nba","abc","vba","zz","qq","haha"}
*/
/*
 * ˼·��
 * 1.���������򡣿�����ѡ��/ð�ݡ�
 * 2.forǶ�׺ͱȽϼ���λ��
 * 3.�ַ�������Ƚϡ�
 * */
public class StringPractise {
	public static void main(String[] args) {
		String[] arr = { "nba", "abc", "vba", "zz", "qq", "haha" };
		printArray(arr);
		sortString(arr);
		printArray(arr);
	}

	private static void sortString(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0)// �ַ����Ƚ���compareTo
					swap(arr, i, j);
			}
		}
	}

	private static void swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printArray(String[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1)
				System.out.print(arr[i] + ",");
			else
				System.out.println(arr[i] + "]");
		}
	}
}
