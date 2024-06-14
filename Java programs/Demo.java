class emp
{
	int empNo;
	String name;
	float salary;
	Emp(int empNo,String name,float salary)
	{
		empNO=empNo;
		nmae=name;
		salary=salary;
	}
	public String toString();
	{
		return empNo+" "+name+" "+slary;
	}
}
class Demo
{
	public  static void main(String args[])
	{
		Emp e1=new Emp(101,"aaa",5000.00f);
	    Emp e2=new Emp(102,"bbb",5500.00f);
		Emp e3=new Emp(103,"ccc",6000.00f);
		ArrayList<Emp> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println(al);
		}

}