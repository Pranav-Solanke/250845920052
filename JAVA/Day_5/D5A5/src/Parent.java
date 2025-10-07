// Static Nested Classes
//A static nested class is associated with the outer class itself, not with any specific instance.

public class Parent // outer class
{
	public void m1()
	{
		System.out.println("in Parent class");
	}
	static class Child //static inner class
	{
		public void m2()
		{
			System.out.println("in Child class");
		}
	}
}

//Key Characteristics:
//Access to Outer Class Members: Can only access the static members (including private ones) of the outer class. It cannot directly access non-static members.
//
//Instantiation: Can be instantiated on its own without needing an instance of the outer class.
//
//Syntax: OuterClass.StaticNestedClass staticNestedObject = new OuterClass.StaticNestedClass();
//
//Behavior: Behaves much like a regular top-level class, but its name is scoped within the outer class.
//
//Declaration: Must be explicitly declared with the static keyword.
