package admin;

abstract class Shapes
{
	public int a;
	public Shapes(int a)
	{
		this.a=a;
	}//¹¹Ôìº¯Êı
	abstract double getmj();
	abstract double getzc();
}
class Circle8 extends Shapes{
	public Circle8(int a)
	{
		super(a);
	}
	public double getmj()
	{
		return (a*a*Math.PI);
	}
	public double getzc()
	{
		return(2*a*Math.PI);
	}
class jx extends Shapes{
	public int b;
	public jx(int x,int y){
		super(x);
		b=y;
	}
	public double getmj(){
		return (a*b);
	}
	public double getzc(){
		return(2*a+2*b);
	}
}

public class AbstractShapes {
   public void main(String[] args)
   {
        Circle8 y = new Circle8(5);
        System.out.println(y.getmj());
        System.out.println(y.getzc());
}
}
}