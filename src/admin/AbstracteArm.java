package admin;
abstract class Arm{
	private String a;
	
	public void Name(String a){
		this.a=a;
	}
	abstract double Way();
}
class Bb extends Arm{

	@Override
	double Way() {
		// TODO Auto-generated method stub
		for(int n = 0;n<=10;n++){
			System.out.println("³å°¡¡£¡£¡£");
		}
		
		return 0;
	}

}
class Rkb extends Arm{
	double Way(){
		for(int n = 0;n<=10;n++){
			System.out.println("à½à½¡£¡£");
			
		}
		return 0;
	}
}
class Pb extends Arm{
	double Way(){
		for(int n = 0;n<=10;n++){
			System.out.println("Í»Í»¡£¡£");
		}
		return 0;
	}
}
public class AbstracteArm {
   public static void main(String[] args)
   {
	   Arm arm = new Bb();
	   arm.Way();
	   Arm arm1 = new Rkb();
	   arm1.Way();
	   Arm arm2 = new Pb();
	   arm2.Way();
   }
}
