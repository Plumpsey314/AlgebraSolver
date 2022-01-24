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

    /**
     * This is the data of all Array operations. 
     * for 4+3+2 the method will
     * @return [4,3,2]
     */
    public abstract Expression[] data();
    
}
