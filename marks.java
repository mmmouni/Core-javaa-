class marks
{
	public static void main(String [] args)
	{
		String[] names = new String[5];
		names [0] =" mouni";
		names[1] ="Chaitu";
		names[2] =" Sravani";
		for (int i =0; i<names.length ;i++ )
		{
			if(names[i]==null)
			{
				System.out.println(names[i]+"..."+i);
			}
			else
			{
				System.out.println(names[i]);
			}
		}
	}
}