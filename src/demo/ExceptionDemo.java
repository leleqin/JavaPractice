package demo;

class FuShuIndexException extends Exception
{
	FuShuIndexException()
	{}
	FuShuIndexException(String msg)
	{
		super(msg);
	}
}

class Demo9
{
	public int method(int[] arr,int index)throws FuShuIndexException
	{
		if(index<0)
			throw new FuShuIndexException("�Ǳ��ɸ�����");
			return arr[index];
	}
}
public class ExceptionDemo {

	public static void main(String[] args) {
		int[] arr = new int[3];
		Demo9 d = new Demo9();
		try
		{
			int num = d.method(arr, -30);
			System.out.println("num="+num);
		}
		catch (FuShuIndexException e)
		{
			System.out.println("�����Ǳ��쳣");
		}
		System.out.println("over");
	}

}
