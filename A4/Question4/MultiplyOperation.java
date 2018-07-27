
public class MultiplyOperation implements MathOperation {

    int operand1;
    int operand2;

    public MultiplyOperation(int o1, int o2) {
	operand1 = o1;
	operand2 = o2;
    }

    @Override
    public int GetResult() {
	return operand1 * operand2;
    }

}
