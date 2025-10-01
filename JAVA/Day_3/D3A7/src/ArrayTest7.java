//max Row wise
public class ArrayTest7
{
	public static void main(String[] args)
	{
		int [][]arr = new int[3][3];
		ArrayService7.acceptData(arr);
		ArrayService7.displayData(arr);
		
		int []maxColl = ArrayService7.maxCollumnWise(arr);
		for(int val:maxColl)
		{
			System.out.println("max of collumn is "+val);
		}
	}
}
