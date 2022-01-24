package Expression;

public abstract class UnaryOperation extends Expression {
    @Override
    public String showStandard() {
        String stanardData = this.data().showStandard();
        return this.name()+"("+stanardData+")";
    }

    /**
     * This is the data of all Unary operations. 
     * for -(4) the method will
     * @return 4
     */
    public abstract Expression data();
}
