//convert 2d array to 1d array
public class ArrayTest14
{
	public static void main(String[] args)
	{
		int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
		ArrayService14.displayData(arr);
		
		int temp[] = ArrayService14.convertArray(arr);
		
		for(int i=0;i<temp.length;i++)
		{
			System.out.print(temp[i] + " ");
		}
	}
}
