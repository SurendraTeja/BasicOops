class Code1
{
	static int x;
	int y;
	public static void main(String[] args)
	{
		Code1.x=10;
		Code1 obj=new Code1();
			  obj.y=20;
		System.out.println(x);
		System.out.println(obj.y);
	}
}