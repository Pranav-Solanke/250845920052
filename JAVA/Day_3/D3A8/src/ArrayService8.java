import java.util.Scanner;

public class ArrayService8
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
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static int[][] add2Array(int [][] arr1,int[][] arr2)
	{
		int [][]temp = new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
				temp[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return temp;
	}

}