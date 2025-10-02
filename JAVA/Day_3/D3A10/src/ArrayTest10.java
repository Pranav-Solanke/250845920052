//max Row wise
public class ArrayTest10
{
	public static void main(String[] args)
	{
		int [][]arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		ArrayService10.displayData(arr1);
		
		int [][]temp = ArrayService10.transpose(arr1);
		
		ArrayService10.displayData(temp);
	}
}
