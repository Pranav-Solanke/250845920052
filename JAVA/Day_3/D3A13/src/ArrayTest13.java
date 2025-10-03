//max Coll wise
public class ArrayTest13
{
	public static void main(String[] args)
	{
		int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
		ArrayService13.displayData(arr);
		
		int [][]temp = ArrayService13.rotateColl(arr);
		
		ArrayService13.displayData(temp);
	}
}
