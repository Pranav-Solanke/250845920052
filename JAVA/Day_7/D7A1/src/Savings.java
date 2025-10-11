
public class Savings extends AccountAbstract
{
	@Override
	public void deposit(int amt)
	{
		balance = balance + amt;
	}
}
