package primenumber;

import java.util.Scanner;

public class PrimeNumberExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The given Number");
		int x = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0)
				count++;
		}
		if (count == 2)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}
}
