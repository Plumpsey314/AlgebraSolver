package Expression;

public class Variable extends Expression{

    private String var;

    Variable(String n){
        var = n;
        String[] allLegalVars = this.legalVars();
        boolean legalVar = false;
        for(int i = 0; (i < allLegalVars.length && !legalVar); i++){
            if(allLegalVars[i].equals(n)){
                legalVar = true;
            }
        }
        if(!legalVar){
            throw new IllegalArgumentException("Can not have a variable that is not declared as legal");
        }
    }

    @Override
    public String name() {
        return "V";
    }

    @Override
    public String showStandard() {
        return this.name()+"("+var+")";
    }

    @Override
    public String showUncompiled() {
        return var;
    }

    @Override
    public Fractional eval() {
        //Not yet implemented
        return null;
    }

    public String data(){
        return var;
    }
    
}
