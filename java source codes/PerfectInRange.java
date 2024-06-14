class PerfectInRange
{
	public static void main(String args[])
	{
		int sum=0;
		for(int a=1;a<=1000;a++)
		{
		for (int i=1;i<a;i++)
		{
			if(a%i==0)
				 sum=sum+i;
		}
		if(sum==a)
			System.out.println(a);
	}
	}
}