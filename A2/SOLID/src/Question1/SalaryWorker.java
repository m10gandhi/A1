package Question1;

public class SalaryWorker implements CaculateworkerPay {
	
	private float salary;
	private int hoursPerWeek;

	public SalaryWorker()
	{
		salary = 50000.0f;
		hoursPerWeek = 40;
	}


	@Override
	public Float calculatepay(int hours) {
		float hourlyRate = salary / (52 * hoursPerWeek);
		return hourlyRate * hours;
	}

}
