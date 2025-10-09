//9) program to call function when function is static and in different class
class Class2
{
	public static void function()
	{
		System.out.println("Function Called from FunctionCall2.");
	}
}

public class FunctionCall2
{
	public static void main(String[] args)
	{
		// Calling the static function using the ClassName.functionName() syntax
		Class2.function(); 
	}
}