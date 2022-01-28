package Expression;

public class Product extends ArrayOperation{

    private Expression[] multiplicands;

    public Product(Expression[] exps){
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
        String rv = "";
        for (Expression ex : multiplicands) {
            rv += "("+ex.showUncompiled()+")";
        }
        return rv;
    }

    @Override
    public Fractional evalEvaluatedChildren(Fractional[] exps) {
        if(exps.length == 0){
            return new Fractional(1);
        }
        if(exps.length == 1){
            return exps[0];
        }
        Expression productEx = new Multiplication(new Value(exps[0]), new Value(exps[1]));
        for(int i = 2; i < exps.length; i++){
            productEx = new Multiplication(productEx, new Value(exps[i]));
        }
        return productEx.eval();
    }
    
}
