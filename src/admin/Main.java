package admin;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		 Scanner scanner = new Scanner(System.in);
		 /*������һ��Scanner����ʱ��Ҫһ��System.in����
		 ��Ϊʵ���ϻ���System.in��ȡ���û����롣
		 Scanner��next()��������ȡ���û�������ַ�����
		 nextInt()��ȡ�õ������ַ���ת��Ϊ�������ͣ�
		 ͬ����nextFloat()ת���ɸ����ͣ�nextBoolean()ת���ɲ����͡�*/
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
			 System.out.print("���������"+year+"��"+"����ĵĵ�"+sum+"��");
				 //System.out.println("������"+time[0]+"��"+time[1]+"��"+time[2]+"��");
			 }
		 }
}

