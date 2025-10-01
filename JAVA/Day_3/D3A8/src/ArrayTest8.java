//max Row wise
public class ArrayTest8
{
	public static void main(String[] args)
	{
		int [][]arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int [][]arr2 = {{1,2,3},{4,5,6},{7,8,9}};
		ArrayService8.displayData(arr1);
		ArrayService8.displayData(arr2);
		
		int [][]addition = ArrayService8.add2Array(arr1,arr2);
		
		ArrayService8.displayData(addition);
		for(int[] val:addition)
		{
			System.out.println(val+" ");
		}
	}
}
