package admin;
class An{
	private String name;
	public void cry(){
		System.out.println("");
	}
}
class Dog2 extends An{
    public void eat(){
    	System.out.println("骨头，，肉肉");
    }
	public void cry(){
		System.out.println("汪汪。。。汪汪");
	}
}
class Cat extends An{
	public void cry(){
		System.out.println("喵喵。。。喵喵");
	}
}
public class DtAn {
    public static void main(String[] args)
    {
    	An a1 = new Dog2();//向上转型
    	
    	a1.cry();
    	An a2 = new Cat();
    	a2.cry();
        //向下转型
    	//((Dog2) a1).eat();
    	Dog2 d=(Dog2)a1;   
    	d.eat();
    }
}
