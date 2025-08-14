import java.util.*;
import java.util.function.Predicate;
public class Ex7 {
	public static void main(String[] args) {
		List list=Arrays.asList(10,2,4,6,7,8,"j",'l',10.7);
		Predicate<Integer> p= val->val%2==0;
		list.stream().filter(p).
		forEach(System.out::println);
		
		
		
		
	}

}