package Expression;

public abstract class ArrayOperation extends Expression {

    @Override
    public String showStandard() {
        Expression[] data = this.data();
        String standardData = "";
        for(int i = 0; i < data.length; i++) {
            if(i != 0){
                standardData += ",";
            }
            standardData += data[i].showStandard();
        }
        return this.name()+"(["+standardData+"])";
    }

    @Override
    public String showUncompiled() {
        Expression[] data = this.data();
        String uncompiledData = "";
        for(int i = 0; i < data.length; i++) {
            if(i != 0){
                uncompiledData += ",";
            }
            uncompiledData += data[i].showUncompiled();
        }
        return this.name()+"(["+uncompiledData+"])";
    }

    @Override
    public Fractional eval() {
        Expression[] exps = this.data();
        Fractional[] evaledExps = new Fractional[exps.length];
        for(int i = 0; i < exps.length; i++){
            evaledExps[i] = exps[i].eval();
        }
        return evalEvaluatedChildren(evaledExps);
    }

    public abstract Fractional evalEvaluatedChildren(Fractional[] exps);


    /**
     * This is the data of all Array operations. 
     * for 4+3+2 the method will
     * @return [4,3,2]
     */
    public abstract Expression[] data();
    
}
