package Question6;

import java.io.FileReader;
import java.util.Scanner;

public class Loader {
	
	PiggyBank pb = new PiggyBank();

	public void Load()
	{
		try
		{
			Scanner in = new Scanner(new FileReader("piggybank.txt"));
			pb.numPennies = Integer.parseInt(in.next());
			pb.numDimes = Integer.parseInt(in.next());
			pb.numNickels = Integer.parseInt(in.next());
			pb.numQuarters = Integer.parseInt(in.next());
		}
		catch (Exception e)
		{
			System.out.println("I am a bad programmer that hid an exception.");
		}
	}
}
