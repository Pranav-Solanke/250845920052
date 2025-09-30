import java.util.Scanner;
public class TestArray3
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
	
	//sequential search data in an array 
		 public static int searchByValue(int[] arr, int f) {
			for(int i=0;i<arr.length;i++) {
				if(f==arr[i]) {
					return i;
				}
			}
			return -1;
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
		
		System.out.println("enter data for search");
        int f=sc.nextInt();
        int pos=searchByValue(arr,f);
        
        if(pos!=-1)
        {
        	System.out.println(f+" Found at position : "+pos);
        }else
        {
        	System.out.println(f+ "not found");
        }
        sc.close();
	}

}
