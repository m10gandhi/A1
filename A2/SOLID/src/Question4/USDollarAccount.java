package Question4;

public class USDollarAccount extends BankAccount
{
	static final float EXCHANGE_RATE = 0.75f;
	float change;
	
	public void Credit(float amount)
	{
		change = balance * EXCHANGE_RATE;
		
		change += amount * EXCHANGE_RATE;
	}

	public void Debit(float amount)
	{
change = balance * EXCHANGE_RATE;
		
		change -= amount * EXCHANGE_RATE;
	}
	
	public float GetBalance() 
	{	
	return change/EXCHANGE_RATE;
	}


}
