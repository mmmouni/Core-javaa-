import java.util.Scanner;
class Large 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number......");
		int number = sc.nextInt();
		int large =0;
		while(number != 0)
		{
			int digit = number % 10;
			if(digit > large )
		{
						large = digit;
		}
				number = number/10 ;
		}
			System.out.println("large number is  "+large);
		}
	}
