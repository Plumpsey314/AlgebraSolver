package Expression;

public class Addition extends ArrayOperation{

    private Expression[] addends;

    Addition(Expression[] exps){
        addends = exps;
    }

    @Override
    public Expression[] data() {
        return addends;
    }

    @Override
    public String name() {
        return "A";
    }

    @Override
    public String showUncompiled() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String eval() {
        return null;
    }
    
}
