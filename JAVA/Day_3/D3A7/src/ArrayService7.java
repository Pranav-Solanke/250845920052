import java.util.Scanner;

public class ArrayService7
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

	public static int[] maxCollumnWise(int[][] arr)
	{
		int []temp = new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++)
		{
			int max = arr[0][i];
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j][i]>max)
				{
					max=arr[j][i];
				}
			}
			temp[i]=max;
		}
		return temp;
	}

}