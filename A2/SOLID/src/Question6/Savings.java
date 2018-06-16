package Question6;

import java.io.PrintWriter;

public class Savings {


	PiggyBank pb = new PiggyBank();
	
	public void Save()
	{
		try
		{
			PrintWriter writer = new PrintWriter("piggybank.txt", "UTF-8");
			writer.println(Integer.toString(pb.numPennies));
			writer.println(Integer.toString(pb.numDimes));
			writer.println(Integer.toString(pb.numNickels));
			writer.println(Integer.toString(pb.numQuarters));
			writer.close();
		}
		catch (Exception e)
		{
			System.out.println("I am a bad programmer that hid an exception.");
		}
	}

}
