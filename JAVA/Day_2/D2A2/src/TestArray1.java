import java.util.Scanner;
public class TestArray1
{
	public static void acceptData(int []arr)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
	}
	
	public static void displayData(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i] + " ");
		}
	}
	
	public static void main(String[] args)
	{
		int [] arr = new int[5];
		
		acceptData(arr);
		
		displayData(arr);
		
	}

}
