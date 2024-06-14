package java8_features_functional_interface;

interface MyFunction {
	int apply(int x, int y);
}

public class Demo {
	public static void main(String[] args) {
		MyFunction add = (a, b) -> a + b;
		System.out.println(add.apply(10, 5));
	}
}
