class Code5
{
	static int get()
	{
		int x=5;
		int y=3;
		return x;
		return y;
	}
	public static void main(String[] args)
	{
		System.out.println(get()+get());//error because method have only one return value
	}
}