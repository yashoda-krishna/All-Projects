import java.util.*;
import java.util.function.Consumer;

public class ex8 {
	public static void main(String args[]) {
		List<Object> list=Arrays.asList(10,2,4,6,7,8,"j",'l',10.7);
		
		Consumer<Object> con=val-> System.out.println(val);
		list.forEach(con);
		  
		
	}

}
//import java.util.*;
//import java.util.function.Consumer;
//
//public class ex8 {
//    public static void main(String args[]) {
//        List<Object> list = Arrays.asList(10, 2, 4, 6, 7, 8, "j", 'l', 10.7);
//
//        Consumer<Object> con = val -> System.out.println(val);
//        list.forEach(con);
//    }
//}
