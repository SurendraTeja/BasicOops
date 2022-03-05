class Code2
{
	int a;
	void setA(int a)
	{
		this.a=a;
	}
	void disp()
	{
		System.out.println(this.a);
	}
	public static void main(String[] args)
	{
		Code2 obj=new Code2();
			  obj.setA(10);
			  obj.setA(20);
			  obj.disp();
	}
}