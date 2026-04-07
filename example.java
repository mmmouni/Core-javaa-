

public class exmple
{
	int x;
	int y;
	void m1(example e)
	{
		x =x+1;
		y =y+2;
	}
	public static void main(String[] args)
	{
		example e1 = new example();
		example e2 = new example(); 
		e1.m1(e2);
		System.out.println(e1.x+" " +e1.y);
		System.out.println(e2.x+" " +e2.y);

		e2.m1(e1);
		System.out.println(e1.x+" " +e1.y);
		System.out.println(e2.x+" " +e2.y);

		e1.m1(e1);
		System.out.println(e1.x+" " +e1.y);
		System.out.println(e2.x+" " +e2.y);

		e2.m1(e2);
		System.out.println(e1.x+" " +e1.y);
		System.out.println(e2.x+" " +e2.y);
	}
}
