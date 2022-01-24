package Expression;

public abstract class Expression {

    /**
     * This method shows and
     * @returns all of the legal variables allowed.
     * 
     * Currently, it is hardcoded, but this will likely be autimated in 
     * due time.
     */
    public String[] legalVars(){
        String[] rv = {"x"};
        return rv;
    }

    /**
     * 
     * @returns the name of the string. For example, in the add
     * method the name would be A.
     */
    public abstract String name();

    /**
     * 
     * @returns a string that shows the compiled expression. This will return
     * A([4,3,2]) for 4+3+2
     */
    public abstract String showStandard();

    /**
     * 
     * @returns a string that shows the expression. This will return
     * 4+3+2 for 4+3+2
     */
    public abstract String showUncompiled();

    /**
     * 
     * @returns a string that shows the standard form of the evaluated expression.
     * Will return 9 for 4+3+2 
     */
    public abstract String eval();
}
