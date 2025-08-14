
public class Ex3 {
	public static void main(String[] args)
	{
		Supplier<String> supplier=()->"Supplier method";
		System.out.println(supplier.get());
		
	}

}
interface Supplier<T>
{
	T get();
}