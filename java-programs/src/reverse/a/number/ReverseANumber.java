package reverse.a.number;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = s.nextInt();
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		System.out.println("Reverse number:" + rev);
	}
}
