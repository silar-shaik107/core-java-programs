package digits.of.given.number;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter Any Number:");
	int a=sc.nextInt();
	int b;
	while(a>0) {
		b=a%10;
		System.out.println(b);
		a=a/10;
	}
}
}
