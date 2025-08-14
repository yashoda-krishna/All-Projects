
public class Ex6 {
	public static void main(String[] args)
	{
		predicate<Integer> pred=(Integer val)->
		{
			if(val%2==0)
			{	
			return true;
			}
			else
			{
				return false;
			}
			 
		};
		System.out.println(pred.apply(10));
	}

}
@FunctionalInterface
interface predicate<T>
{
	boolean apply(T t);
}
