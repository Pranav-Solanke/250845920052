
public class ArrayTest {

	public static void main(String[] args)
	{
		int [][]arr = new int[3][];
		//int [][]arr = new int[][]; error;
		//int [][]arr = new int[][1]; error;
	
		//int [][][]arr = new int[1][][]; valid
		//int [][][]arr = new int[1][1][]; valid
		//int [][][]arr = new int[1][][1]; error
		//int [][][]arr = new int[][][1]; error
		
		ArrayService.acceptData(arr);
		ArrayService.displayData(arr);
		
	}

}
