package Question1;
import java.util.ArrayList;

public class Employer
{
	ArrayList<CaculateworkerPay> empworkers;

	public Employer()
	{
		empworkers = new ArrayList<CaculateworkerPay>();
		for (int i = 0; i < 5; i++)
		{
			empworkers.add(new HourlyWorker());
		}

		for (int i = 0; i < 5; i++)
		{
			empworkers.add(new SalaryWorker());
		}

	}

	public void outputWageCostsForAllStaff(int hours)
	{
		float cost = 0.0f;
		for (int i = 0; i < empworkers.size(); i++)
		{
			CaculateworkerPay worker = empworkers.get(i);
			cost += worker.calculatepay(hours);
		}

		System.out.println("Total wage cost for all staff = $" + cost);
	}
}