package methodreferences;

import java.util.function.Function;

public class MethodReferenceExample {

	public static void main(String[] args) {
		String str="silar";
		
		
		//Lambda expression
		 Function<String,Integer> lambdaFunction=s->s.length();
		 System.out.println(lambdaFunction.apply(str));
		 
	    //Method Reference to the length() method of String Class
		 Function<String,Integer> referenceFunction=String::length;
		 System.out.println(referenceFunction.apply(str));
	}
}
