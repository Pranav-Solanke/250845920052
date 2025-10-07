import java.util.Scanner;
public class TestStudentArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("\n1. add new student\n2. display all\n3. search by id");
		System.out.println("4. search by name\n5. update marks\n6.exit\nchoice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			boolean status=StudentService.addNewStudent();
			if(status) {
				System.out.println("Student added successfuly");
			}else {
				System.out.println("error: Not added");
			}
			
			break;
			
		case 2:
			StudentService.displayAll();
			break;
			
		case 3:
			Student s =StudentService.searchById();
			if(s!=null)
			{
				System.out.println(s);
			}
			else
			{
				System.out.println("Student does not exists");
			}
			break;
			
		case 4:
			Student s2 = StudentService.searchByName();
			if(s2!=null)
			{
				System.out.println(s2);
			}
			else
			{
				System.out.println("Student does not exists");
			}
			break;
			
		case 5:
			StudentService.updateMarks();
			break;
		case 6:
			sc.close();
			System.out.println("Thank you for visiting....");
			break;
		default:
			System.out.println("wrong choice");
			
		}
		}while(choice!=6);

	}
	}

