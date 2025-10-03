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

	public static int[] MaxColWise(int[][] arr)
	{
		int maxlength = arr[0].length; 
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length>maxlength)
				
			{
				maxlength = arr[i].length;
			}
		}
		//2D arrays in Java can be jagged, meaning not all rows need to have the same number of columns.
		//This loop goes through all the rows to find the maximum row length, i.e., the maximum number of columns that any row has.
		
		
		int []temp = new int[maxlength];
		//Initialize a temporary array to store column maximums
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]>temp[j])
				{
					temp[j]=arr[i][j];
				}
			}
		}
		//For each element arr[i][j], check if it's greater than the current temp[j] (current max for that column).
		//If so, update temp[j].
		
		return temp;
	}
	
}
