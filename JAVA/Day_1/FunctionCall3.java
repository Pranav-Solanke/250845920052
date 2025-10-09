//10) program to call function when function is non-static and in different class
class Class3
{
	public void function()
	{
		System.out.println("Function Called from FunctionCall3.");
	}
}

public class FunctionCall3
{
	public static void main(String[] args)
	{
		// Calling the non-static function using the obj.functionName() syntax
		Class3 obj = new Class3();
		obj.function();
	}
}