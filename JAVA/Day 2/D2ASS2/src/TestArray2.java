import java.util.Scanner;
public class TestArray2
{
	public static void acceptData(int []arr)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	
	public static int adddata(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
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
		Scanner sc=new Scanner(System.in);
		int [] arr = new int[5];
		
		acceptData(arr);
		
		int sum=adddata(arr);
		System.out.println("Addition : "+sum);
		
		sc.close();
	}

}
