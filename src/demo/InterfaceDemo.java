package demo;

abstract class Animal
{
	private String eat;
	private String run;
	Animal(String eat,String run)
	{
		this.eat=eat;
		this.run=run;
	}
	public abstract void speak();
	}
class Ji extends Animal
{
	Ji(String eat,String run){
		super(eat,run);
	}

	@Override
	public void speak() {
		System.out.println("¿©¿©¡£¡£¡£");
		// TODO Auto-generated method stub
		
	}
}
class Dog extends Animal
{

	Dog(String eat, String run) {
		super(eat, run);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		System.out.println("ÍôÍô");
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {
  public static void main(String[] aegs)
  {
	  Ji ji = new Ji("Ã×","Ìø");
	  Dog dog = new Dog("Èâ","ÅÜ");
	  dog.speak();
	  ji.speak();
  }
}
