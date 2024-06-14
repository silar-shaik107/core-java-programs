//Default Methods in Interface
//this feature allows to write concrete instance methods in interface by using default keyword
//Interface:-it contains public static final variables and public abstract methods

package java8_features_default_methods;

interface Test {
	default void show() {
		System.out.println("Naresh I technologies ");
	}
}

class Demo implements Test {
	public static void main(String[] args) {
		Test t = new Demo();
		t.show();
	}
}