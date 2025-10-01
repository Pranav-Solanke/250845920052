//max Row wise
public class ArrayTest6
{
	public static void main(String[] args)
	{
		int [][]arr = new int[3][3];
		ArrayService6.acceptData(arr);
		ArrayService6.displayData(arr);
		
		int []maxRow = ArrayService6.maxRowWise(arr);
		for(int val:maxRow)
		{
			System.out.println("max of row is "+val);
		}
	}
}
