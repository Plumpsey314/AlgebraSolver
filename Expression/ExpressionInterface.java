package Expression;

public abstract class ExpressionInterface {

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
     * method the name would be add.
     */
    public abstract String name();

    /**
     * 
     * @returns a string that shows the expression. This will return
     * 
     * Add
     */
    public abstract String showStandard();

    /**
     * 
     * @returns a string that shows the expression.
     * 
     */
    public abstract String showUncompiled();

        /**
     * 
     * @returns a string that shows the expression.
     * 
     */
    public abstract String eval();
}
