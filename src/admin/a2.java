package admin;

public class a2 {
	public static void main(String[] args){
        int n=2017;
        if(n%4==0&&n%100!=0||n%400==0)
        System.out.println(n+"年份闰年");
        else
		System.out.println(n+"年份不是闰年");	

	}
}	
