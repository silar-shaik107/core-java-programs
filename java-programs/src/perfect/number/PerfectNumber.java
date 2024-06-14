//sum of factors is equals to given number is called perfect number
//ex:-6,28, 496,8,128 etc
package perfect.number;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<a;i++) {
			if(a%i==0)
				sum+=i;
		}
		if(sum==a)
			System.out.println("The given number is a perfect");
		else
			System.out.println("The given number is not a perfect");
	}

}
