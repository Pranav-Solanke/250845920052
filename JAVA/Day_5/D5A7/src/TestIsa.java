
public class TestIsa {

	public static void main(String[] args)
	{
		Parent p1 = new Parent();
		//Reference : Parent , at compile time check if method is present in Parent
		//Object : Parent , at runtime decides to call method according to object that is Parent
		
		p1.m1();
		p1.m2();
		//p1.m3(); // error : can't access child methods
		
		//------------------------------------
		
		Child c1 = new Child();
		//Reference : Child , at compile time check if method is present in Parent
		//Object : Child , at runtime decides to call method according to object that is Child
		
		c1.m1();//Dynamic dispatch : Overridden method decided at runtime based on actual object
		c1.m2();
		c1.m3();
		
		//------------------------------------
		
		Parent p2 = new Child();
		//Reference : Parent , at compile time check if method is present in Parent
		//Object : Child , at runtime decides to call method according to object that is Child
		
		p2.m1();
		p2.m2();
		
		// p2.m3(); //at compile time checks if m3 is present at reference parent , that is not present
		//thats why gives compile time error . but can be called by casting as below.
		
		((Child)p2).m3();
		//The reference is of type Parent.
		//The compiler checks in Parent class — m3() doesn’t exist there.
		// So compile-time error, even though actual object is Child.
		//You can access it only by casting ((Child)p2).m3();
	}

}
