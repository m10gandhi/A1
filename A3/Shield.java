
public class Shield extends Decoratorshield {

	private int ShieldHealth;
	BoardComponent square;

	public Shield(BoardComponent square) {
		super();
		this.square = square;
	}

	public Shield() {
		super();
		ShieldHealth = 2;
	}

	@Override
	public void Operation() {
		square.Operation();
	}

	@Override
	public void Add(BoardComponent child) {
		square.Add(child);

	}

	@Override
	public void Remove(BoardComponent child) {
		square.Remove(child);

	}

	@Override
	public void update(BoardComponent attack) {
		if (attack.equals(this.square)) {
			if (ShieldHealth == 0) {
				square.update(attack);

			} else {
				ShieldHealth--;
			}
		}

	}
}
