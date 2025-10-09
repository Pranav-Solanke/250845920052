//Has a Relationship 
//Team has a player
import java.util.Scanner;
public class TestTeamArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("\n1. add new team\n");
		System.out.println("2. Display all teams\n");
		System.out.println("3. search team by id\n");
		System.out.println("4. Add new player\n");//not understood
		System.out.println("5. search a player\n");
		System.out.println("6. exit\\nChoice: \n");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			boolean status = TeamService.addTeam();
			if(status)
			{
				System.out.println("Team added successfully");
			}
			else
			{
				System.out.println("team not added");
			}
			break;
			
		case 2:
			TeamService.displayTeams();
			break;
			
		case 3:
			Team t = TeamService.findById();
			if(t!=null)
			{
				System.out.println(t);
			}
			else
			{
				System.out.println("team does not exist");
			}
			break;
			
		case 4:
			status = TeamService.addNewPlayer();
			if(status)
			{
				System.out.println("Player added successfully");
			}
			else
			{
				System.out.println("Player not added");
			}
			break;
			
		case 5:
			System.out.println("enter pid to search");
			int pid=sc.nextInt();
			Team team=TeamService.findTeamByplayer(pid);
			if(team!=null) {
				System.out.println(team);
			}else {
				System.out.println("player not found");
			}
			break;
			
		case 6:
			sc.close();
			System.out.println("Thank you for visiting.......");
			break;
			
		default:
			System.out.println("Wrong choice");
			break;
		}
		}while(choice!=6);
	}
}
