import java.util.Scanner; 
public class ArrayService
{
	public static void acceptData(int [][] arr)
	{
		Scanner sc  = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Column length for row "+i);
			int col = sc.nextInt();
			
			arr[i] = new int[col];//imp : allocates column for this row
			
			System.out.println("Enter data : ");
			for(int j=0;j<col;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
	}

	public static void displayData(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println("");
		}
		
	}
	// imp : without int max
		public static int[] MaxRowWise(int[][] arr)
		{
			int[] temp=new int[arr.length];
			for(int i=0;i<arr.length;i++)
			{
				temp[i]=arr[i][0]; //assign 1 st element of the row
				for(int j=0;j<arr[i].length;j++) {
					if(temp[i] < arr[i][j])
					{
						temp[i]=arr[i][j];
					}
				}
			}
			
			return temp;
		}
	
		//with it max
//	public static int[] MaxRowWise(int[][] arr)
//	{
//		int []temp = new int[arr.length];
//		for(int i=0;i<arr.length;i++)
//		{
//			int max = arr[i][0];
//			for(int j=0;j<arr[i].length;j++)
//			{
//				if(arr[i][j]>max)
//				{
//					max=arr[i][j];
//				}
//			}
//			temp[i]=max;
//		}
//		return temp;
//	}
}
