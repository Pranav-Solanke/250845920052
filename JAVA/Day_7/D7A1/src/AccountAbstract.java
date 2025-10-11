
public abstract class AccountAbstract
{
	public int balance;
	abstract public void deposit(int amt); //abstract method
	public void display()
	{
		System.out.println("Balance "+balance);
	}
}
