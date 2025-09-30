import java.util.Scanner;

public class AllOccurance {

    public static int[] findAllOccurences(int[] arr, int num) {
		int[] temp=new int[arr.length];
		for(int i=0;i<temp.length;i++) {
			temp[i]=-1;
		}
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				temp[cnt]=i;
				cnt++;
			}
		}
		if(cnt>0) {
			return temp;
		}
		return null;
	}

    public static void displayData(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+": "+arr[i]+",  ");
		}
		System.out.println("-----------------------");
		
	}


	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		ArrayService.acceptData(arr);

		System.out.println("enter data to search");
			num=sc.nextInt();
			int[] arrpos=ArrayService.findAllOccurences(arr,num);
			if(arrpos!=null) {
				System.out.println("all positions are : ");
				ArrayService.displayData(arrpos);
			}else {
				System.out.println("not found");
			}
	}
}