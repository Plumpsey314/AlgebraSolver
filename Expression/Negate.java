package Expression;

public class Negate extends UnaryOperation {

    private Expression ex;

    Negate(Expression e){
        ex = e;
    }

    @Override
    public Expression data() {
        return ex;
    }

    @Override
    public String name() {
        return "N";
    }

    @Override
    public String showUncompiled() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String eval() {
        Expression[] exps = new Expression[2];
        exps[0] = new Value(-1);
        exps[1] = ex;
        return new Multiplication(exps).eval();
    }    
}
