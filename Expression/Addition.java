package Expression;

public class Addition extends BinaryOperation {

    private Expression data0;
    private Expression data1;

    //Curently just adds 2 fractions.
    public Addition(Expression a, Expression b){
        data0 = a;
        data1 = b;
    }

    @Override
    public Expression data0() {
        return data0;
    }

    @Override
    public Expression data1() {
        return data1;
    }

    public String showUncompiled() {
        String data0 = this.data0().showUncompiled();
        String data1 = this.data1().showUncompiled();
        return data0+"+"+data1;
    }

    @Override
    public String name() {
        return "A";
    }

    @Override
    public Fractional eval() {
        return addFractions(data0.eval(),data1.eval());
    }

    private Fractional addFractions(Fractional a, Fractional b){
        return new Fractional(a.numerator()*b.denominator()+b.numerator()*a.denominator(), a.denominator()*b.denominator()).reduce();
    }
    
}
