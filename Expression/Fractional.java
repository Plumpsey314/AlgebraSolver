package Expression;

public class Fractional{

    private int numerator;
    private int denominator;

    public Fractional(int n, int d){
        numerator = n;
        denominator = d;
        if(d==0){
            throw new IllegalArgumentException("Denomitoator can not be 0");
        }
    }

    public Fractional(int n){
        numerator = n;
        denominator = 1;
    }

    public float toFloat(){
        return ((float)numerator)/((float)denominator);
    }

    public int toInt(){
        return numerator/denominator;
    }

    public int numerator(){
        return numerator;
    }

    public int denominator(){
        return denominator;
    }

    //Method not yet implemented
    public Fractional reduce(){
        return this;
    }

    /**
     * @returns a fractional implementation of the string.
     * 
     * For example if the fraction is 3/4 the method returns 3/4
     * 
     * If the fraction is 3/1 the method returns 3
     */
    @Override
    public String toString(){
        if(denominator==1){
            return (new Integer(numerator)).toString();
        }
        return (new Integer(numerator)).toString()+"/"+(new Integer(denominator)).toString();
    }

}
