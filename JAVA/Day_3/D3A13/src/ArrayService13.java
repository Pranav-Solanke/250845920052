import java.util.Scanner;

public class ArrayService13
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

	public static int[][] rotateColl(int[][] arr)
	{
		//allocate memory for temp
		int[][] temp=new int[arr.length][arr[0].length];
		//copy arr into temp
		for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			temp[i][j]=arr[i][j];
		}
		}
		//copy last column into temp1
		int[] temp1=new int[temp.length];
		for(int i=0;i<temp1.length;i++) {
			temp1[i]=temp[i][temp[0].length-1];
		}
		//shift all columns towards right by 1 column
		//starting from 2nd  last column
		for(int i=0;i<temp.length;i++) {
			for(int j=temp[0].length-2;j>=0;j--) {
				temp[i][j+1]=temp[i][j];
			}
		}
		//copy temp1 into 0th column
		for(int i=0;i<temp.length;i++) {
			temp[i][0]=temp1[i];
		}
		return temp;
	}
	
//	public static void rotateColl(int[][] arr)
//	{
//		int []temp = new int[arr.length];
//		for(int i=0;i<arr.length;i++)
//		{
//			temp[i] = arr[i][arr[0].length-1];
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=arr[0].length-2;j>=0;j++)
//			{
//				arr[i][j+1] = arr[i][j];
//			}
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i][0] = temp[i];
//		}
//	}
}
