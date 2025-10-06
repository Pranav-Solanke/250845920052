
public class TestStudentArray {

	public static void main(String[] args)
	{
		boolean status = StudentService.addNewStudent();
		if(status)
		{
			System.out.println("Student added successfully");
		}
		else
		{
			System.out.println("Error : Student not added");
		}
	}

}
