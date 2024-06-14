//Static Methods:-this feature allows to write concrete methods in Interface
// here we no need to create a object to call show() method, because it is a static method
// we can call directly by method name
package java8_features_static_methods;

public interface Test {
	static void show() {
		System.out.println("Welcome");
	}
}
class Demo{
	 public static void main(String[] args) {
		Test.show();
	}
}