import java.util.Scanner;

public class ArrayService {
	public static int findNthMax(int []arr,int n)
	{
		int pos=0;
		for(int i=0;i<n;i++)
		{
			pos = findMaxPos(arr,i);
			
			int temp = arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		return arr[n-1];
	}
	
	public static int findMaxPos(int []arr,int start)
	{
		int max = arr[start];
		int pos=start;
		for(int i=start+1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				pos=i;
			}
		}
		return pos;
	}
	
	public static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter data");
			arr[i]=sc.nextInt();
		}
		
	}
}
