import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ex10 {
public static void main(String[] args) {
	List<Object> list=Arrays.asList(10,2,4,5,9,3,6,7,8);

	Function<Object, String> describe = val -> {
	    if (val instanceof Integer) {
	        return val + " is an Integer";
	    } else if (val instanceof String) {
	        return val + " is a String";
	    } else if (val instanceof Character) {
	        return val + " is a Character";
	    } else if (val instanceof Double) {
	        return val + " is a Double";
	    } else {
	        return val + " is of unknown type";
	    }
	};

	list.stream().map(n->(Integer) n).
	filter(n-> n%2!=0).forEach(System.out::println);
	
	//System.out.println(a);

}
}
