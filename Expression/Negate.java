package Expression;

public class Negate extends UnaryOperation {

    private Expression ex;

    public Negate(Expression e){
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
        return "-("+ex.showUncompiled()+")";
    }

    @Override
    public Fractional eval() {
        Fractional evaluated = ex.eval();
        return new Fractional(-1*evaluated.numerator(), evaluated.denominator()).reduce();
    }    
}
