
public class ArrayTest
{

	public static void main(String[] args)
	{
		int [][]arr = new int[3][];
		
		ArrayService.acceptData(arr);
		ArrayService.displayData(arr);
		
		
		int []temp =ArrayService.MaxColWise(arr);
		for(int i=0;i<temp.length;i++)
		{
			System.out.println("max of col "+i+" is "+temp[i]);
		}
	}

}
