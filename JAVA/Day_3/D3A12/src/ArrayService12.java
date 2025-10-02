import java.util.Scanner;

public class ArrayService12
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
			System.out.println("");
		}
	}

	public static void rotateRows(int[][] arr)
	{
		int []temp = new int[arr[0].length];
		
		temp = arr[0];
		
		for(int i=0;i<arr.length-1;i++)
		{
				arr[i]=arr[i+1];
		}
		
			arr[arr.length-1]=temp;
	}
}