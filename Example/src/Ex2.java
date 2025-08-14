
public class Ex2 {
	public static void main(String[] args)
	{
	Consumer<Integer> consumer=( Integer val)->
	{
		System.out.println("number"+" "+val);
	};
	consumer.accept(10);
	}

}
@FunctionalInterface
 interface Consumer<T>
{
	void accept(T t);
}

