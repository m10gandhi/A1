
public class SpawnShieldCommand extends Command {

	public SpawnShieldCommand(Object receiver, String[] args) {
		super(receiver, args);
	}

	@Override
	public void Execute() {
		Square square = (Square) receiver;
		// The args for SpawnBuildingCommand are the X,Y coordinate for the Building used by the factory, 
		IAsteroidGameFactory factory = GameBoard.Instance().GetFactory();
		Shield sh = new Shield(square);
		System.out.println("Spawning Shields at (" + args[0] + "," + args[1] + ")");
		GameBoard.Instance().getSubject().Detch(square);
		GameBoard.Instance().getSubject().Attach(sh);
	}

}
