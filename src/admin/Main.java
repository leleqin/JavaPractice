package admin;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		 Scanner scanner = new Scanner(System.in);
		 /*在新增一个Scanner对象时需要一个System.in对象，
		 因为实际上还是System.in在取得用户输入。
		 Scanner的next()方法用以取得用户输入的字符串；
		 nextInt()将取得的输入字符串转换为整数类型；
		 同样，nextFloat()转换成浮点型；nextBoolean()转换成布尔型。*/
		 while (scanner.hasNext()){
			 String string=scanner.next();
			String[] strings = string.split("/");
			 int[] time = new int[strings.length];
			 for (int i=0;i<strings.length;i++){
				 time[i] = Integer.parseInt(strings[i]);}
			    
			    int year=time[0];
				int month=time[1];
				int day=time[2];
				int sum=0;
				
				if(year%4==0&&year%100!=0||year%400==0)
				{
				    int days[]={0,31,29,31,30,31,30,31,31,30,31,30};
				    
					for(int j=1;j<days.length;j++){
						sum+=days[j-1];
						if(month==j) break;
					}
					sum=sum+day;
				}
				else{
					int days[]={0,31,28,31,30,31,30,31,31,30,31,30};
					for(int j=1;j<days.length;j++){
						sum+=days[j-1];
						if(month==j) break;
						
					}
					sum=sum+day;
				}
			 System.out.print("您输入的是"+year+"年"+"今年的的第"+sum+"天");
				 //System.out.println("今年是"+time[0]+"年"+time[1]+"月"+time[2]+"日");
			 }
		 }
}

