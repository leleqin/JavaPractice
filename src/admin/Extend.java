package admin;

class Extend {                    //定义父类——圆类
       float r;                  //成员变量——圆的半径                   
       float s;
       
   void show(float r1)
   {
	 System.out.println("r="+r+",s="+3.14*r*r);
   }
   void getArea(float r1){
	r=r1;
}
}
class yzt extends Extend
{
	
	float h;
	float v;
	void seth(float h1)
	{
		h=h1;
	}
	void show()
	{
		System.out.println("v"+3.14*r*r*h);
	}
}
class aa
{
	public static void main(String args[])
	{
		yzt t1=new yzt();
		t1.getArea(4);
		t1.show();
		t1.seth(8);
		t1.show();
	}

	
}