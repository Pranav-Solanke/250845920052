import java.util.Scanner;

public class ArrayService4
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

	public static void displayData(int[][] arr) {
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
	
	public static int[] addCollumnWise(int[][] arr)
	{
		int []temp= new int[arr[0].length];
		for(int i=0;i<arr[i].length;i++)
		{
			temp[i]=0;
			for(int j=0;j<arr.length;j++)
			{
				temp[i] = temp[i] + arr[j][i];
			}
		}
		return temp;
	}
	
}