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
	        System.out.println(year+"�������");
	        else
			System.out.println(year+"��ݲ�������");
	}
	void display(){
		System.out.println("�����ǣ�"+year+"��"+month+"��"+day+"��");
		
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
