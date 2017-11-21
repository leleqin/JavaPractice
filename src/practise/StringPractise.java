package practise;

/*1.给定一个字符串数组，按照字典顺序进行从小到大的排列
{"nba","abc","vba","zz","qq","haha"}
*/
/*
 * 思路：
 * 1.对数组排序。可以用选择/冒泡。
 * 2.for嵌套和比较及换位。
 * 3.字符串对象比较。
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
				if (arr[i].compareTo(arr[j]) > 0)// 字符串比较用compareTo
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
