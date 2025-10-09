
public class TestIPLTeam
{
	public static void main(String[] args)
	{
//		Player[] plist = {
//		  new Player(33,"Hardik","AllRounder")
//		 ,new Player(93,"Bumrah","Bowler")
//		 ,new Player(63,"Surya","Batsman")
//		 };
		
		//or
		Player[] plist = new Player[3];
		
		plist[0] =new Player(33,"Hardik","AllRounder");
		plist[1] =new Player(93,"Bumrah","Bowler");
		plist[2] =new Player(63,"Surya","Batsman");
		
		
		Player c = new Player(45,"Rohit","Batsman");
		
		Team t1 = new Team(1,"MI",plist,c);
		
		System.out.println(t1);
	}

}
