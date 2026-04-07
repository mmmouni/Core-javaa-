import java.util.Scanner;
class NumPorN
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter user name...3&7");
		int number=s.nextInt();
		if(number==0 && number %7==0)
		{
			System.out.println("number is divisible by 3&7");
		}
		else
		{
			System.out.println("System.out.println by 3&7");
		}
		s.close();
	}
}
		

