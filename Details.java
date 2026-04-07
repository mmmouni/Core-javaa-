import java.util.Scanner;
class  Details
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Book Id.......");
		int bookID = sc.nextInt();
		System.out.println("Book name.......");
		String bookname = sc.next();
		System.out.println("Book authorname.......");
		String authorname = sc.next();
		System.out.println("Book price.......");
		int bookprice = sc.nextInt();
		System.out.println("Your book details are...." );
		System.out.println(bookID+" "+bookname+" "+authorname+" " +bookprice);
		System.out.println("Do you want one more book (yes/no)");
		String oncemore = sc.next();
		if(oncemore.equals("yes"))
			{
			System.out.println("Your book details are...." );
		System.out.println(bookID+" "+bookname+" "+authorname+" " +bookprice);
			}
			else
				break;
		}
	}
}
