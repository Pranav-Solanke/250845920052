import java.util.Arrays;

public class Team
{
	private int tid;
	private String tname;
	private Player[] plist;
	private Player captain;
	public Team() {
		super();
		tid=0;
		tname=null;
		plist=null;
		captain=null;
	}
	public Team(int tid, String tname, Player[] plist, Player captain) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.plist = plist;
		this.captain = captain;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Player[] getPlist() {
		return plist;
	}
	public void setPlist(Player[] plist) {
		this.plist = plist;
	}
	public Player getCaptain() {
		return captain;
	}
	public void setCaptain(Player captain) {
		this.captain = captain;
	}
	@Override
	public String toString() {
		return "Team [tid=" + tid + ", tname=" + tname + ", plist=" + Arrays.toString(plist) + ", captain=" + captain
				+ "]";
	}
}
