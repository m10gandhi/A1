
public class SubstractOperation extends MathOperation {

    public SubstractOperation(int o1, int o2) {
	super(o1, o2);
    }

    @Override
    public int GetResult() {
	return operand1 - operand2;
    }

}
