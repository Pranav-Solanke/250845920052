//7) program to pass input num through command line argument and print Table
//java -classpath build CommandLine 15 20 15
class CommandPrintTable
{
	public static void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n + "*" + i + "=" + n*i);
		}
	} 	

	public static void main(String []args)
	{
		if(args.length<1)
		{
			System.out.println("Enter one input");
		}
		printTable(Integer.parseInt(args[0]));
	}
}
