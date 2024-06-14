//package consumer;
//
//import java.util.function.Consumer;
//
//public class ConsumerDemo implements Consumer<Integer> {
//
//	@Override
//	public void accept(Integer t) {
//		System.out.println("Printing:" + t);
//	}
//
//	public static void main(String[] args) {
//
//	}
//}

package functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<Integer> con = (t) -> System.out.println("printing:" + t);
		
		con.accept(10);
		
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		list1.stream().forEach(con);
	}
}