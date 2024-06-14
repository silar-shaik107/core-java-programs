import java.util.Scanner;//printing of digits of gievn number
class Digits
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number:");
		int a=s.nextInt();
		int b;
		while(a>0)
		{
			b=a%10;
			System.out.println(b);
			a=a/10;
		}
	}
}