//add row wise
public class ArrayTest3
{

	public static void main(String[] args)
	{
		int [][]arr = new int[3][3];
		ArrayService3.acceptData(arr);
		ArrayService3.displayData(arr);
		
		int arrAdd[] = ArrayService3.addRowWise(arr);
		
		//m1
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println("Sum of row "+(i+1)+" is "+arrAdd[i]);
//		}
		
		//m2
		for(int val:arrAdd)
		{
			System.out.println("Sum of row is "+val);
		}
	}

}
