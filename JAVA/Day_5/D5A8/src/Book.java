//composition (the "has-a" relationship) using a nested inner class
public class Book
{
	private int bid;
	private String bname;
	private Lesson l1;//A field that holds an object of the inner class Lesson.
	//This shows composition—a Book has a Lesson.
	
	public class Lesson //Lesson is a non-static inner class.
	//This means: 1. An instance of Lesson must be tied to an instance of Book.
	//2. Lesson objects can directly access private members of the Book object they are tied to
	{
		private int lid;
		private String lname;
		
		public Lesson()
		{
			lid = 0;
			lname = null;
		}
		
		public Lesson(int lid,String lname)
		{
			this.lid =lid;
			this.lname =lname;
		}
		
		public void m1()
		{
			System.out.println("in method m1");
		}

		@Override
		public String toString() {
			return "Lesson [lid=" + lid + ", lname=" + lname + "]";
		}
	}

	
	public Book()
	{
		super();
		this.bid=0;
		this.bname=null;
	}

	public Book(int bid, String bname,int lid, String lname)
	{
		super();
		this.bid = bid;
		this.bname = bname;
		this.l1=new Lesson(lid,lname);
		//it then creates a new Lesson object using the given lid and lname 
		//and assigns this new object to the l1 field: this.l1 = new Lesson(lid, lname);.
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", l1=" + l1 + "]";
	}
	
}
