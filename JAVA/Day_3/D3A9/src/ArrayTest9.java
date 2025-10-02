//max Row wise
public class ArrayTest9
{
	public static void main(String[] args)
	{
		int [][]arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int [][]arr2 = {{1,2,3},{4,5,6},{7,8,9}};
		ArrayService9.displayData(arr1);
		ArrayService9.displayData(arr2);
		
		int [][]multiply = ArrayService9.multiplyArray(arr1,arr2);
		
		ArrayService9.displayData(multiply);
		
//		for(int []val:multiply)
//		{
//			System.out.println(val + " ");
//		}
	}
}
