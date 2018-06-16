package Question6;

public class PiggyBank
{
public int numPennies;
	int numDimes;
	int numNickels;
	int numQuarters;

	public PiggyBank()
	{
		numPennies = 0;
		numDimes = 0;
		numNickels = 0;
		numQuarters = 0;
	}

	public void AddPenny()
	{
		numPennies += 1;
	}

	public void AddDime()
	{
		numDimes += 1;
	}

	public void AddNickel()
	{
		numNickels += 1;
	}

	public void AddQuarter()
	{
		numQuarters += 1;
	}

	public void save(Savings save) {
	save.Save();
	}
	
	public void load(Loader load) {
		load.Load();
	}
}