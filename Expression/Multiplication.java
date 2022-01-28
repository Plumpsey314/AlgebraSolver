package Expression;

public class Multiplication extends BinaryOperation{

    private Expression multiplicand0;
    private Expression multiplicand1;


    public Multiplication(Expression a, Expression b){
        multiplicand0 = a;
        multiplicand1 = b;
    }

    @Override
    public String name() {
        return "M";
    }

    @Override
    public String showUncompiled() {
        // Will eventually get rid of parenthesis when they are unnesesary.
        return "("+multiplicand0.showUncompiled()+")*("+multiplicand1.showUncompiled()+")";
    }

    @Override
    public Expression data0() {
        return multiplicand0;
    }

    @Override
    public Expression data1() {
        return multiplicand1;
    }

    @Override
    public Fractional eval() {
        Fractional evaluated0 = multiplicand0.eval();
        Fractional evaluated1 = multiplicand1.eval();
        return new Fractional(evaluated0.numerator()*evaluated1.numerator(),evaluated0.denominator()*evaluated1.denominator()).reduce();
    }
    
}
