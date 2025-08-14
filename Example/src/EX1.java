
public class EX1 
{
	public static void main(String[] args)
	{
		B b=(int a)->
		{
			System.out.println("hello"+a);
			return 10;
		};
		System.out.println(b.m1(10));
	}
}
@FunctionalInterface
interface B
{
	 int m1(int a);
	
}



