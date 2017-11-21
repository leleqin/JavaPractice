package admin;

import java.util.Scanner;

class Circle {
	private double radius;
	private double c;
	private double s;
	
	Circle(double r){
		this.radius=r;
	}
	Circle(){
		this.radius=0;
	}
	void getArea(double radius){
		s=radius*radius*Math.PI;
	}
	void getPerimeter(double radius){
		c=2*radius*Math.PI;
	}
	void show(){
		System.out.println("圆的半径是"+radius+"圆的周长"+c+"圆的面积"+s);
	}
	/*public class zzx{*/
	public static void main(String[] args){
        System.out.println("输入一个圆的半径=");
		Scanner scanner = new Scanner(System.in);
		double radius;
		radius=scanner.nextInt();
		System.out.println("输入数据："+radius); 
		Circle d=new Circle();
		/*d.getArea();
		d.getPerimeter();
		d.show();*/
	
}
 }
