//
public class ArrayTest5
{
	public static void main(String[] args)
	{
		int [][]arr = new int[3][3];
		ArrayService5.acceptData(arr);
		ArrayService5.displayData(arr);
		
		int max = ArrayService5.findMax(arr);
		System.out.println("maximum number is "+max);
	}

}
