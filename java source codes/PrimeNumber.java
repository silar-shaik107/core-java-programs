import java.util.Scanner;
class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=s.nextInt();
		int count=0;
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
				count++;
		}
		if(count==2)
			System.out.println("prime number");
		else
			System.out.println("Not a prime number");
	}
}