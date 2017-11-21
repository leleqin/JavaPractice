package practise;

import java.util.Arrays;
/*
 * 对一个字符串中的数值进行从小到大的排序
 * "20 78 9 -7 88 36 29"
 * 
 * 思路：
 * 1.排序
 * 2.获取字符串中需要排序的数值
 * 3.用字符串的切割方法将数值取出来放进数组
 * 4.字符串--->基本类型
 * */
public class WrapperPractise {

	public static void main(String[] args) {
		String num = "20 78 9 -7 88 36 29";
		System.out.println(num);//排之前
		num = sortStringNumber(num);
		System.out.println(num);//排之后
		
	}

	public static String sortStringNumber(String num) {
		//1.将字符串变成字符串数组
		String[] str_arr = num.split(" ");
		//2.将字符串数组变成int数组
		int[] num_arr = toIntArry(str_arr);
		//3.对int数组排序
		mySortArry(num_arr);
		//4.将排序后的int数组变成字符串
		String temp = arrayToString(num_arr);
		return temp;
	}

	public static String arrayToString(int[] num_arr) {
		StringBuilder sb = new StringBuilder();
		for (int x = 0; x < num_arr.length; x++) {
			if(x!=num_arr.length-1)
				sb.append(num_arr[x]+" ");
			else
				sb.append(num_arr[x]);
		}
		return sb.toString();
	}

	public static void mySortArry(int[] num_arr) {
		Arrays.sort(num_arr);
	}

	public static int[] toIntArry(String[] str_arr) {
		int[] arr = new int[str_arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str_arr[i]);
		}
		return arr;
	}

}
