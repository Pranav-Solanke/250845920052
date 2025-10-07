// Non-Static Nested Classes
//An inner class is associated with an instance of its outer class.

public class Parent // outer class
{
	public void m1()
	{
		System.out.println("in Parent class");
	}
	public class Child //static inner class
	{
		public void m2()
		{
			System.out.println("in Child class");
		}
	}
}

//Key Characteristics:
//Access to Outer Class Members: An inner class has access to all members of its enclosing class, including private members.
//
//Instantiation: You must instantiate the outer class first to create an inner class object.
//
//Syntax: OuterClass.InnerClass innerObject = outerObject.new InnerClass();
//
//Member Types: Can be declared as public, protected, default, or private.
