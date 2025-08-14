import java.util.*;

import java.util.function.Supplier;

public class ex9 {
	public static void main(String[] args) {
		List<Object> list=Arrays.asList(10,2,4,6,7,8,"j","l",10.7);
		Supplier<List<Object>> integerSupplier = () -> {
		    List<Object> intList = new ArrayList<>();
		    for (Object val : list) {
		        if (val instanceof Double) {
		            intList.add( val);
		        }
		    }
		    return intList;
		};

		System.out.println("Integers in list: " + integerSupplier.get());

	}

}
