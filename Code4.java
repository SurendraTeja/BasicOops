class Code4
{
	void m1()
	{
		System.out.println("hello world");
	}
	void m2()
	{
		//void does not have return type return "hi";
	}
	String m3()
	{
		//System.out.println("hi");
		return "hi";
	}

	public static void main(String[] args)
	{
		Code4 obj=new Code4();
			obj.m1();//hello world
			obj.m2();// null
			obj.m3();//null because we are not passing value
	}
}	