package Expression;

public class Multiplication extends ArrayOperation{

    private Expression[] multiplicands;

    Multiplication(Expression[] exps){
        multiplicands = exps;
    }

    @Override
    public Expression[] data() {
        return multiplicands;
    }

    @Override
    public String name() {
        return "M";
    }

    @Override
    public String showUncompiled() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String eval() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
