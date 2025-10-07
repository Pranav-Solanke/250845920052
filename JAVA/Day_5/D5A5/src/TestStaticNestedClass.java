
public class TestStaticNestedClass {

	public static void main(String[] args)
	{
		Parent p = new Parent();
		p.m1();
		
//		Child c = new Child(); //error here
//		c.m2();
		
		Parent.Child c = new Parent.Child();
		c.m2();
	}

}
