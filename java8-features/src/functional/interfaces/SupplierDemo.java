//package consumer;
//
//import java.util.function.Supplier;
//
//public class SupplierDemo implements Supplier<String>{
//
//	@Override
//	public String get() {
//		
//		return "Silar Shaik";
//	}
//	   public static void main(String[] args) {
//		   Supplier<String> suppiler= new SupplierDemo();
//		   System.out.println(suppiler.get());
//	}
//
//}

//java 8
package functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	
	
	   public static void main(String[] args) {
		  Supplier<String> suppiler= () ->{
			   return "shaik silar";
		   };
		  // System.out.println(suppiler.get()); 
		 // List<String> list1= Arrays.asList("si","la");
		   List<String> list1= Arrays.asList();
		System.out.println(list1.stream().findAny().orElseGet(suppiler));
	}

}
