import java.util.Scanner;
public class TeamService
{
	static Team [] tarr ;
	static int cnt;
	static
	{
		tarr = new Team[100];
		Player [] plist1 = new Player[15];
		plist1[0] =new Player(33,"Hardik","AllRounder");
		plist1[1] =new Player(93,"Bumrah","Bowler");
		plist1[2] =new Player(63,"Surya","Batsman");
		
		Player c1 = new Player(45,"Rohit","Batsman");
		
		tarr[0] = new Team(1,"MI",plist1,c1,3);
		
		Player [] plist2 = new Player[15];
		plist2[0] =new Player(61,"Salt","Batsman");
		plist2[1] =new Player(15,"Bhuvi","Bowler");
		plist2[2] =new Player(99,"Jitesh","WicketKeeper");
		
		Player c2 = new Player(18,"Virat","Batsman");
		
		tarr[1] = new Team(2,"RCB",plist2,c2,3);
		
		cnt=2;
	}
	
	public static boolean addTeam()
	{
		if(cnt!=100)
		{
			Scanner sc = new Scanner(System.in);
			
			//for captain
			System.out.println("enter captain player id ");
			int pid = sc.nextInt();
			
			System.out.println("enter captain player name ");
			String pname = sc.next();
			
			System.out.println("enter captain player speciality ");
			String speciality = sc.next();
			
			Player c =new Player(pid,pname,speciality);
			
			Player[] plist = new Player[15];
			plist[0]=c;
			
			
			//loop for creating player list
			int i=1;
			String ans="y";
			do
			{
				System.out.println("enter player id ");
				pid = sc.nextInt();
				
				System.out.println("enter player name ");
				pname = sc.next();
				
				System.out.println("enter player speciality ");
				speciality = sc.next();
				
				plist[i] =new Player(pid,pname,speciality);
				
				System.out.println("Do you want to add more players (y/n)");
				ans = sc.next();
			}while(ans.equals("y"));
			
			
			//team 
			System.out.println("enter tid");
			int tid=sc.nextInt();
			System.out.println("enter team name");
			String tname=sc.next();
			
			tarr[cnt]= new Team(tid,tname,plist,c,i);
			cnt++;
			return true;
		}
		return false;
	}
	
	public static void displayTeams()
	{
		for(Team t:tarr)
		{
			if(t!=null)
			{
				System.out.println(t);
			}
		}
	}

	public static Team findById()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id to search");
		int id = sc.nextInt();
		
		for(Team t:tarr)
		{
			if(t!=null)
			{
				if(id==t.getTid())
				{
					return t;
				}
			}
			break;
		}
		return null;
	}

	public static boolean addNewPlayer() //not understood
	{
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("enter player id ");
		int pid = sc.nextInt();
		
		System.out.println("enter player name ");
		String pname = sc.next();
		
		System.out.println("enter player speciality ");
		String speciality = sc.next();
		
		Player p=new Player(pid,pname,speciality);
		
		Team t=findById();
		
		if(t!=null)
		{
			int s=t.getSize();
			//adding player in player list of team
			t.getPlist()[s]=p;
			t.setSize(s+1);
			return true;
		}
		return false;
	}

	public static Team findTeamByplayer(int pid) {
		for(Team t:tarr) {
			if(t!=null) {
				//retrieve player array from team
				Player[] plst=t.getPlist();
				for(Player p:plst) {
					if(p!=null) {
						if(p.getPid()==pid) {
							return t;
						}
					}else {
						break;
					}
				}
			}else {
				break;
			}
		}
		return null;
	}
}
