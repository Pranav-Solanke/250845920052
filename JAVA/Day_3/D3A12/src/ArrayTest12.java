//max Row wise
public class ArrayTest12
{
	public static void main(String[] args)
	{
		int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
		ArrayService12.displayData(arr);
		
		ArrayService12.rotateRows(arr);
		
		ArrayService12.displayData(arr);
	}
}
