
public class MultiplyOperation extends MathOperation {

    public MultiplyOperation(int o1, int o2) {
	super(o1,o2);
    }

    @Override
    public int GetResult() {
	return operand1 * operand2;
    }

}
