
public class ArrayTest
{

	public static void main(String[] args)
	{
		int [][]arr = new int[3][];
		
		ArrayService.acceptData(arr);
		ArrayService.displayData(arr);
		
		
		int []temp =ArrayService.MaxRowWise(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("max of row "+i+" is "+temp[i]);
		}
	}

}
