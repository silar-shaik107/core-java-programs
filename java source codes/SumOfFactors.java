import java.util.Scanner;
class SumOfFactors
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any number:");
		int a=s.nextInt();
		int sum=0;
		for (int i=1;i<=a;i++)
		{
			if (a%i==0)
				sum=sum+i;
		}
		System.out.println(sum);
	}
}