package admin;
class An{
	private String name;
	public void cry(){
		System.out.println("");
	}
}
class Dog2 extends An{
    public void eat(){
    	System.out.println("��ͷ��������");
    }
	public void cry(){
		System.out.println("��������������");
	}
}
class Cat extends An{
	public void cry(){
		System.out.println("��������������");
	}
}
public class DtAn {
    public static void main(String[] args)
    {
    	An a1 = new Dog2();//����ת��
    	
    	a1.cry();
    	An a2 = new Cat();
    	a2.cry();
        //����ת��
    	//((Dog2) a1).eat();
    	Dog2 d=(Dog2)a1;   
    	d.eat();
    }
}
