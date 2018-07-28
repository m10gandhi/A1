public abstract class MathOperation {

    protected int operand1;
    protected int operand2;
    
    public MathOperation(int operand1, int operand2) {
	this.operand1 = operand1;
	this.operand2 = operand2;
    }
    
    public abstract int GetResult();

}