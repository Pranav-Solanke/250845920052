import java.util.Scanner;

public class ArrayService
{
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
	
	public static int findNthMin(int []arr,int n)
	{
		int pos=0;
		for(int i=0;i<n;i++)
		{
			pos = findMinPos(arr,i);
			
			int temp = arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		return arr[n-1];
	}
	public static int findMinPos(int []arr,int start)
	{
		int min = arr[start];
		int pos=start;
		for(int i=start+1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				pos=i;
			}
		}
		return pos;
	}
	
		public static void acceptData(int[] arr)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		}

		public static void displayData(int[] arr)
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(i+": "+arr[i]);
			}
			System.out.println("----------------------------------------------------------------");
		}
		
		public static boolean isPrime(int n)
		{
			if(n<2)
				return false;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
					return false;
				break;
			}
			return true;
		}
		
		public static boolean isOdd(int n)
		{
			if(n%2==0)
			{
				return false;
			}
			return true;
		}
		
		public static void fact(int n)
		{
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println(n+" factorial is : "+fact);
		}
		
		public static int nthMaxPrime(int []arr,int n)
		{
			int []temp = new int[arr.length];
			for(int i=0;i<arr.length;i++)
			{
				temp[i]=-1;
			}
			
			int cnt=0;
			for(int i=0;i<arr.length;i++)
			{
				if(isPrime(arr[i]))
				{
					temp[cnt]=arr[i];
					cnt++;
				}
			}
			int result = findNthMax(temp,n);
			return result;
		}
		
		public static int nthMinPrime(int []arr,int n)
		{
			int []temp = new int[arr.length];
			for(int i=0;i<arr.length;i++)
			{
				temp[i]=-1;
			}
			
			int cnt=0;
			for(int i=0;i<arr.length;i++)
			{
				if(isPrime(arr[i]))
				{
					temp[cnt]=arr[i];
					cnt++;
				}
			}
			int result = findNthMin(temp,n);
			return result;
		}
}
