import java.util.Scanner;

public class ArrayService
{
	public static void acceptData(int[][] arr)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter data");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[0].length;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	}
	
	public static void displayData(int[][] arr)
	{
	System.out.println("array is :");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[0].length;j++)
		{
			System.out.print(arr[i][j] + " ");
		}
	}
	}
}
