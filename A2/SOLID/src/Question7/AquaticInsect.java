package Question7;

public class AquaticInsect implements Swim, MoveAntennae{


	@Override
	public void Swim() {
		
		System.out.println("Sploosh!");
		
	}

	@Override
	public void MoveAntennae() {
		
		System.out.println("Moving my antennae underwater!");
		
	}
}
