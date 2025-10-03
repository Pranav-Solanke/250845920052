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

	public static int[] AddColWise(int[][] arr)
	{
		int maxlength = arr[0].length; 
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length>maxlength)
				
			{
				maxlength = arr[i].length;
			}
		}
		
		int[] temp=new int[maxlength];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				temp[j] = temp[j] + arr[i][j];
			}
		}
		
		return temp;
	}
	
}
