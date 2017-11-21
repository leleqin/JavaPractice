package admin;
/*100到200内的质数*/
public class a3 {
	public static void main(String[] args){
		int n,f,i,k=0;
		for(n=100;n<=200;n++)
		{
			f=0;
			for(i=2;i<n;i++)
				if(n%i==0)
					f=1;
			if(f==0)
			{System.out.print(n+" ");
			k++;}	
if(k%5==0)
	System.out.println(" ");
		}
		}

}
