import java.util.Scanner;

public class ArrayService11
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

	public static boolean identity(int[][] arr)
	{
		// Check if matrix is square
		if (arr.length != arr[0].length)
		{
			return false;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if((arr[i][j]!=1 && i==j) || (arr[i][j]!=0 && i!=j))
				{
					return false;
				}
			}
		}
		return true;
	}

	
}