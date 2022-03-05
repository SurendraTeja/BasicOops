class Code3
{
	static void m1()
	{
		System.out.println("m1 logic");
	}
	void m2()
	{
		System.out.println("m2 logic");
	}
	public static void main(String[] args)
	{
		Code3.m1();
		Code3 obj=new Code3();
			  obj.m2();
	}
}