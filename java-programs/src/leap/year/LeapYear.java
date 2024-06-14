package leap.year;

import java.util.Scanner;

public interface LeapYear {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any year:");
		int year = s.nextInt();
		if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a leap year");
		}
	}

}
