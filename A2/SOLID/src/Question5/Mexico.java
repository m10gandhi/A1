package Question5;

public class Mexico implements PLACES {

	public String getAgriculture()
	{
		return "$50000000 MXN";
	}

	public String getTourism()
	{
		return "$100000 MXN";
	}

	@Override
	public void PrintCountryGDPReport() {
		System.out.println("- Canada:\n");
		System.out.println("   - Agriculture: " + getAgriculture());
		System.out.println("   - Manufacturing: " + getTourism());
		
	}
}
