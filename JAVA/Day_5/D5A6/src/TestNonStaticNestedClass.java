
public class TestNonStaticNestedClass
{

	public static void main(String[] args)
	{
		Parent p = new Parent();
		p.m1();
		
//		Child c = new Child(); //error here
//		c.m2();
		
		Parent.Child c = p.new Child();
		c.m2();
	}

}

