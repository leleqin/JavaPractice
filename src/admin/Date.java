package admin;

 class Date {
	private int year;
	private int month;
	private int day;

	Date(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	void setDate(int y,int m,int d){
		year=y;
		month=m;
		day=d;
	}
	void isLeapaYear( ){
		if(year%4==0&&year%100!=0||year%400==0)
	        System.out.println(year+"年份闰年");
	        else
			System.out.println(year+"年份不是闰年");
	}
	void display(){
		System.out.println("今天是："+year+"年"+month+"月"+day+"日");
		
	}

	public static void main(String[] args){
		Date d=new Date(2017,3,14);
		d.display();
		d.isLeapaYear();
		d.setDate(1997,3,4);
		d.display();
		d.isLeapaYear();
}
}
