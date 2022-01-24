package Expression;

public class Value extends Expression {

    private Number num;
    private String numStr;

    Value(Number n){
        num = n;
        numStr = n.toString();
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
    public String eval() {
        return numStr;
    }

    public Number data(){
        return num;
    }
    
}
