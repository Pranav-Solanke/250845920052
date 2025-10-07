import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

	public class StudentService
	{
		static Student [] studarr;
		static int cnt;
		static
		{
			studarr = new Student[100];
			studarr[0] = new Student(1,"Pranav",100,99,new Date(2003-11-03));
			studarr[1] = new Student(2,"Krishna",100,100,new Date(2002-11-03));
			studarr[2] = new Student(3,"Devashish",99,98,new Date(2002-01-16));
			cnt=3;
		}
		public static boolean addNewStudent()
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter id");
			int sid = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter name");
			String nm = sc.nextLine();
			
			System.out.println("Enter marks 1");
			float m1 = sc.nextFloat();
			
			System.out.println("Enter marks 2");
			float m2 = sc.nextFloat();
			
			System.out.println("Enter Date");
			String dt = sc.next();
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date bdt = null;
			
			try {
				bdt = sdf.parse(dt);
			} catch (ParseException e)
			{
				System.out.println("enter proper date format");
				e.printStackTrace();
				return false;
			}
			
			Student s = new Student(sid,nm,m1,m2,bdt);
			if(cnt == studarr.length)
			{
				return false;
			}
			else
			{
				studarr[cnt]=s;
				cnt++;
				return true;
				
			}
		}
		public static void displayAll()
		{
			for(Student s : studarr)
			{
				if(s!=null)
				{
					System.out.println(s);
				}
			}
		}
//		for (dataType element : iterableObject) {
//		    // block of code to be executed for each element
//		}

		
		public static Student searchById()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id to search student : ");
			int id = sc.nextInt();
			
			for(Student s:studarr)
			{
				if(s!=null)
				{
					if(id==s.getId())
					{
						return s;
					}
				}
			}
			return null;
		}
		
		public static Student searchByName()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter name to search");
			String name = sc.nextLine();
			for(Student s:studarr)
			{
				if(s!=null)
				{
					if(name.equals(s.getName()))
					{
						return s;
					}
				}
			}
			return null;
		}
		public static void updateMarks()
		{
			Scanner sc = new Scanner(System.in);
			
			Student s = searchById();
			
			if(s!=null)
			{
				System.out.println("enter marks to update for M1 and M2 : ");
				float marks1 = sc.nextFloat();
				float marks2 = sc.nextFloat();
				
				s.setM1(marks1);
				s.setM2(marks2);
				System.out.println("Marks updated successfully");
			}
			else
			{
				System.out.println("Marks not updated , as students does not exists");
			}
			
		}
	}
