package practise;

import java.util.Arrays;
/*
 * ��һ���ַ����е���ֵ���д�С���������
 * "20 78 9 -7 88 36 29"
 * 
 * ˼·��
 * 1.����
 * 2.��ȡ�ַ�������Ҫ�������ֵ
 * 3.���ַ������и������ֵȡ�����Ž�����
 * 4.�ַ���--->��������
 * */
public class WrapperPractise {

	public static void main(String[] args) {
		String num = "20 78 9 -7 88 36 29";
		System.out.println(num);//��֮ǰ
		num = sortStringNumber(num);
		System.out.println(num);//��֮��
		
	}

	public static String sortStringNumber(String num) {
		//1.���ַ�������ַ�������
		String[] str_arr = num.split(" ");
		//2.���ַ���������int����
		int[] num_arr = toIntArry(str_arr);
		//3.��int��������
		mySortArry(num_arr);
		//4.��������int�������ַ���
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
