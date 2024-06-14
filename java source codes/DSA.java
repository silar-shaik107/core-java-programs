//Given an Integer x,return true if x is a palindrome,and false otherwise.//
import java.util.*;
class DSA
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number:");
		int x=s.nextInt();
		int original=x;
		int reverse=0;
		int reminder=0;
		while(x!=0)
		{
			reverse=reverse*10+x%10;
			x=x/10;
		}
		
		if(original==reverse)
		{
		System.out.println("true");
		}
			else
		{
			System.out.println("false");
		}
	}
}