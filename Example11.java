class Example11 
{
	public static void main(String[] args) 
	{
		int c[] = new int[10];
		int a =12;
		int b= 0;
		try
		{
		System.out.println(c[10]);
		b=10/a;
		}
		
		catch(ArrayIndexOutOfBoundsException e)

		{
			System.out.println("somthing went wrong");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Not divided by zero");
		}
		
	}

}
