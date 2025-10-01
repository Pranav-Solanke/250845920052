//add all numbers
public class ArrayTest2
{

	public static void main(String[] args)
	{
		int [][]arr = new int[3][3];
		ArrayService2.acceptData(arr);
		ArrayService2.displayData(arr);
		
		int sum = ArrayService2.addArray(arr);
		System.out.println("sum is "+sum);
	}

}
