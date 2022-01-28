package Expression;

public class Sumation extends ArrayOperation{

    private Expression[] addends;

    public Sumation(Expression[] exps){
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
        String rv = "";
        for(int i = 0; i < addends.length; i++){
            if(i != 0){
                rv += "+";
            }
            rv += addends[i].showUncompiled();
        }
        return rv;
    }

    @Override
    public Fractional evalEvaluatedChildren(Fractional[] exps) {
        if(exps.length == 0){
            return new Fractional(0);
        }
        if(exps.length == 1){
            return exps[0];
        }
        Expression sumEx = new Addition(new Value(exps[0]), new Value(exps[1]));
        for(int i = 2; i < exps.length; i++){
            sumEx = new Addition(sumEx, new Value(exps[i]));
        }
        return sumEx.eval();
    }

       
}