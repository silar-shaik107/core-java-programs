//package lambda.expression;
//
// NOrmal way
//interface Caluclator {
//
//	void switchOn();
//}
//
//public class CaluclatorImpl implements Caluclator {
//
//	public static void main(String[] args) {
//
//	}
//
//	@Override
//	public void switchOn() {
//		System.out.println("Switch On");
//	}
//
//}

// java8 features
package lambda.expression;

interface Caluclator {

	// void switchOn();

	// void sum(int x);

	int substract(int x, int y);
}

public class CaluclatorImpl {

	public static void main(String[] args) {
		/*
		 * Caluclator cal= ()-> { System.out.println("Switch On"); }; cal.switchOn();
		 */

		/*
		 * Caluclator cal = (x) -> { System.out.println("Sum:" + x); }; cal.sum(20);
		 */
        
		/*Caluclator cal=(x,y)-> x-y;
         System.out.println(cal);*/
            //or
		Caluclator cal = (x, y) -> {
			if(x<y) {
				throw new RuntimeException("Message");
			}else {
				return x-y;
			}
		};
		System.out.println(cal.substract(10, 7));
	}
}
