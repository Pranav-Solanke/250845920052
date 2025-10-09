//composition (the "has-a" relationship) using a nested inner class
public class TestBook {

	public static void main(String[] args)
	{
		Book b1 = new Book();//calls default constructor.
		System.out.println(b1);
		
		Book.Lesson l1 = b1.new Lesson();//Creates a separate, standalone Lesson object named l1.
		//b1.new Lesson() is required because Lesson is a non-static inner class 
		//and must be instantiated via an existing outer class object (b1).
		//This lesson object l1 is logically associated with b1 but is not assigned to b1's internal l1 field.
		System.out.println(l1);
		
		Book b2 = new Book(1 , "physics" , 1 , "physicslesson1");
		//This constructor internally creates and assigns a Lesson object to b2's l1 field.
		System.out.println(b2);
		
		Book.Lesson l2 = b2.new Lesson(2,"physiclesson2");
//		/Creates another separate, standalone Lesson object named l2, explicitly tied to the b2 instance.
		System.out.println(l2);
		
		l1.m1();
	}

}
