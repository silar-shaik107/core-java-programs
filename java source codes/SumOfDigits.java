import java.util.*;
class SumOfDigits
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number:");
		int a=s.nextInt();
		int b;
		int sum=0;
		while(a>0)
		{
			b=a%10;
			sum=sum+b;
			a=a/10;
		}
		System.out.println(sum);
	}
}