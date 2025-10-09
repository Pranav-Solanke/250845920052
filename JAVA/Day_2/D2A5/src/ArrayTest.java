import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		ArrayService.acceptData(arr);
		ArrayService.displayData(arr);
		
		int choice;
		do
		{
			System.out.println("\nEnter Choice : \n1:display all prime numbers \n2:find addition of odd number in the array");
			System.out.println("3:find factorial of all numbers less than 7 \n4:find Nth maximum prime number");
			System.out.println("5:find nth minimum prime number \n6:exit \nChoice :");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.print("Prime numbers are : ");
				for(int i=0;i<arr.length;i++)
				{
					if(ArrayService.isPrime(arr[i]))
					{
						System.out.print(arr[i]+" ");
					}
				}
				break;
			case 2:
				int sum=0;
				System.out.print("Odd numbers are : ");
				for(int i=0;i<arr.length;i++)
				{
					if(ArrayService.isOdd(arr[i]))
					{
						sum = sum + arr[i];
						System.out.print(arr[i]+" ");
					}
				}
				System.out.println("\n Sum of odd are :"+sum);
				break;
			case 3:
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]<7)
					{
						ArrayService.fact(arr[i]);
					}
				}
				break;
			case 4:
				int n=1;
				System.out.println("enter nth number :");
				n=sc.nextInt();
				int nthMax = ArrayService.nthMaxPrime(arr,n);
				System.out.println("Nth max prime number is "+nthMax);
				break;
			case 5:
				n=1;
				System.out.println("enter nth number :");
				n=sc.nextInt();
				int nthMin = ArrayService.nthMinPrime(arr,n);
				System.out.println("Nth min prime number is "+nthMin);
				break;
			case 6:
				break;
			default:
				System.out.println("enter correct choice ");
			}
			
		}while(choice!=6);
	}

}
