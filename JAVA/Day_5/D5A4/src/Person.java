//Creating 2 person objects and generating id automatically
public class Person
{
	private int id;
	private String name;
	
	static int cnt;
	static
	{
		cnt = 0;
	}
	
	public Person() {
		super();
		cnt++;
		id=cnt;
		name=null;
	}
	public Person(String name) {
		super();
		cnt++;
		this.id = cnt;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}
