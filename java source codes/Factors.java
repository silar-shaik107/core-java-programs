import java.util.*;
class Factors
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Any Number:");
		int a=s.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
				System.out.println(i);
		}
	}
}