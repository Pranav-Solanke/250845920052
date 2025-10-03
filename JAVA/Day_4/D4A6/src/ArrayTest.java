
public class ArrayTest
{

	public static void main(String[] args)
	{
		int [][]arr = new int[3][];
		
		ArrayService.acceptData(arr);
		ArrayService.displayData(arr);
		
		int []temp =ArrayService.AddColWise(arr);
		for(int i=0;i<temp.length;i++)
		{
			System.out.println("addition of row "+i+" is "+temp[i]);
		}
	}

}
