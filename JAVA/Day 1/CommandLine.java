//5) program to pass inputs through command line argument
//java -classpath build CommandLine a b c d 1 2 3 4
class CommandLine
{
	public static void main(String []args)
	{
		if(args.length<1)
		{
			System.out.println("Enter atleast one input");
		}
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]+" ");
		}
	}
}
