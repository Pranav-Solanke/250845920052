//9) program to call function when function is static and in different class
class FunctionCall1
{
	public static void function()
	{
		System.out.println("Function Called from FunctionCall1.");
	}
	public static void main(String[] args)
	{
		// Calling the static function using functionName() syntax
		function(); 
	}
}
