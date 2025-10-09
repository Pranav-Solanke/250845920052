import java.util.Scanner;
public class NthMax {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int []arr = new int[5];
		int n;
		System.out.println("enter n ");
		n=sc.nextInt();
		ArrayService.acceptData(arr);
		int nthmax=ArrayService.findNthMax(arr,n);
		System.out.println(nthmax+" is "+n+" largest");
	}

}
