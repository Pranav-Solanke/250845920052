import java.util.Scanner;
public class ArrayService
{
	public static int[] findAllOccurences(int[] arr, int num)
	{
		int[] temp=new int[arr.length];
		for(int i=0;i<temp.length;i++)
		{
			temp[i]=-1;
		}
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num) {
				temp[cnt]=i;
				cnt++;
			}
		}
		if(cnt>0)
		{
			return temp;
		}
		return null;
	}
	
	public static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter data");
			arr[i]=sc.nextInt();
		}
		
	}

	public static void displayData(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+": "+arr[i]+",  ");
		}
		System.out.println("-----------------------");
		
	}
}