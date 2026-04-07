import java.util.Scanner;
class Company
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your data manager tl devp hr");
		String data = s.next();
		switch(data)
		{
			case "manager": System.out.println(" you selected manager...");
			                System.out.println(" manager manage the work...");
							break;
		    case "tl"     : System.out.println(" you selected tl...");
			                System.out.println(" to leads the team...");
							break;
            case "devp"   : System.out.println(" you selected devp...");
			                System.out.println(" to develop the data...");
							break;
            case "hr"     : System.out.println(" you selected hr...");
			                System.out.println(" the hr will be hire the recutes...");
							break;
            default       : System.out.println("Enter valid option");
		}
	}
}
		              

