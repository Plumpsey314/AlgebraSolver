package Expression;

public class Value extends Expression {

    private Fractional num;
    private String numStr;

    public Value(Fractional n){
        num = n;
        numStr = num.toString();
    }

    @Override
    public String name() {
        return "";
    }

    @Override
    public String showStandard() {
        return numStr;
    }

    @Override
    public String showUncompiled() {
        return numStr;
    }

    @Override
    public Fractional eval() {
        return num;
    }

    public Fractional data(){
        return num;
    }
    
}
