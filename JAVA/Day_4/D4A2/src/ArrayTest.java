
public class ArrayTest
{

	public static void main(String[] args)
	{
		int [][]arr = new int[3][];
		
		ArrayService.acceptData(arr);
		ArrayService.displayData(arr);
		
		
		int max =ArrayService.findMax(arr);
		System.out.println("max is "+max);
	}

}
