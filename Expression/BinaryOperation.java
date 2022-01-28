package Expression;

public abstract class BinaryOperation extends Expression{

    @Override
    public String showStandard() {
        String data0 = this.data0().showStandard();
        String data1 = this.data1().showStandard();
        return this.name()+"("+data0+","+data1+")";
    }

    @Override
    public String showUncompiled() {
        String data0 = this.data0().showUncompiled();
        String data1 = this.data1().showUncompiled();
        return this.name()+"("+data0+","+data1+")";
    }


    /**
     * This is the first peice of data for all Array operations. 
     * for 4^3 the method will
     * @return 4
     */
    public abstract Expression data0();

    /**
     * This is the second peice of data for all Array operations. 
     * for 4^3 the method will
     * @return 3
     */
    public abstract Expression data1();
    
}
