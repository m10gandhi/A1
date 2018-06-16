package Question1;

public class HourlyWorker implements CaculateworkerPay {
	
	private float hourlyRate;

	public HourlyWorker()
	{
		hourlyRate = 10.0f;
	}

	@Override
	public Float calculatepay(int hours) {
		return hourlyRate * hours;
	}

}
