package Expression;

public class Subtraction extends BinaryOperation {

    private Expression minuend;
    private Expression subtrahend;

    public Subtraction(Expression ex0, Expression ex1){
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
        String data0 = this.data0().showUncompiled();
        String data1 = this.data1().showUncompiled();
        return data0+"-("+data1+")";
    }

    @Override
    public Fractional eval() {
        return new Addition(minuend, new Negate(subtrahend)).eval();
    }
    
}
