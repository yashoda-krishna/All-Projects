
public class Ex4 {
	public static void main(String[] args)
	{
	Function<Integer,String> function=(Integer val)->
	{
		return "Krishna";
	};
	
	System.out.println(function.appl(10));
	}

}
@FunctionalInterface
interface Function<T,G>
{
	G appl(T t);
}
