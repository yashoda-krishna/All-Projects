import java.util.*;

public class Ex5 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,15,3,2,10);
		list.stream().filter(n->n%2==0).forEach(n->{
			System.out.println("even");
		});
		
		
	}

}
