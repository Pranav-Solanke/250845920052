//add collumn wise
public class ArrayTest4
{

	public static void main(String[] args)
	{
		int [][]arr = new int[3][3];
		ArrayService4.acceptData(arr);
		ArrayService4.displayData(arr);
		
		int arrAdd[] = ArrayService4.addCollumnWise(arr);
		
		for(int val:arrAdd)
		{
			System.out.println("Sum of collumn is "+val);
		}
	}

}
