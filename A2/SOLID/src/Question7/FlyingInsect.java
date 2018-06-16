package Question7;

public class FlyingInsect implements Fly, MoveAntennae{

	@Override
	public void Fly() {
		System.out.println("Flap flap!");
		
	}

	@Override
	public void MoveAntennae() {
		System.out.println("Moving my antennae in the air!");	
	}
}
