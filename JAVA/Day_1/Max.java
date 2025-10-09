import java.util.Scanner;
class Max
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a num");
		int n1 = sc.nextInt();
		System.out.println("Enter a num");
		int n2 = sc.nextInt();
		System.out.println("Enter a num");
		int n3 = sc.nextInt();

		if((n1==n2) && (n2==n3))
		{
			System.out.println("Numbers are Same");
		}
		else
		{
			if(n1>n2 && n1>n3)
			{
				System.out.println("greatest is "+n1);
			}else if(n2>n3)
			{
				System.out.println("greatest is "+n2);
			}
			else
			{
				System.out.println("greatest is "+n3);
			}
		}
		
	}
}