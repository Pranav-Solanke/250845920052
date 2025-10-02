//max Row wise
public class ArrayTest11
{
	public static void main(String[] args)
	{
		int [][]arr = {{1,0,0},{0,1,0},{0,0,1}};
		ArrayService11.displayData(arr);
		
		if(ArrayService11.identity(arr))
		{
			System.out.println("it is an Identity matrix");
		}
		else
		{
			System.out.println("it is not Identity matrix");
		}
	}
}
