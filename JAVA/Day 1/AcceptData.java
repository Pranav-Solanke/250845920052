import java.util.Scanner;
class AcceptData
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a num");
		int a = sc.nextInt();

		System.out.println("Enter a float num");
		float b = sc.nextFloat();

		System.out.println("Enter a String 1");
		String c = sc.next();
		sc.nextLine();
		
		System.out.println("Enter a String 2");
		String d = sc.nextLine();

		System.out.println(a+ " " +b + " " +c + " " + " " + d);
		
	}
}