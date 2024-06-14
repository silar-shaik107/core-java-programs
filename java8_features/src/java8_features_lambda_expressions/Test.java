package java8_features_lambda_expressions;

interface Test {
      int add(int a,int b); //abstract method
}

class Demo  {
	public static void main(String[] args) {
	
	
		
		
		
		Test t= (a,b)->a+b;
		int x=t.add(50, 20);
		System.out.println(x);
	}
}