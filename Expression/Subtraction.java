package Expression;

public class Subtraction extends BinaryOperation {

    private Expression minuend;
    private Expression subtrahend;

    Subtraction(Expression ex0, Expression ex1){
        minuend = ex0;
        subtrahend = ex1;
    }

    @Override
    public Expression data0() {
        return minuend;
    }

    @Override
    public Expression data1() {
        return subtrahend;
    }

    @Override
    public String name() {
        return "S";
    }

    @Override
    public String showUncompiled() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String eval() {
        Expression[] exps = new Expression[2];
        exps[0] = minuend;
        exps[1] = new Negate(subtrahend);
        return new Addition(exps).eval();
    }
    
}
