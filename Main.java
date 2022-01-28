import Expression.Addition;
import Expression.Expression;
import Expression.Fractional;
import Expression.Multiplication;
import Expression.Negate;
import Expression.Product;
import Expression.Subtraction;
import Expression.Sumation;
import Expression.Value;

public class Main{
    public static void main(String[] args){
    boolean shouldTest = true;
    if(shouldTest){
        Fractional a = new Fractional(1);
        Fractional b = new Fractional(5);
        Fractional c = new Fractional(-4);
        Fractional d = new Fractional(2);
        Fractional e = new Fractional(271828, 100000);
        Fractional f = new Fractional(1, 4);
        Fractional g = new Fractional(1, -12);
        Fractional pi = new Fractional(22, -7);
        
        Expression h = new Value(b);
        Expression i = new Value(d);
        Expression j = new Value(g);
        
        // Do Fractional Integers work (negative and positive)
        showAllFrac(a);
        showAllFrac(c);

        // Do Fractional Non integers work (negative and positive)
        showAllFrac(e);
        showAllFrac(pi);

        // What if devide by 0?
        try{
            Fractional divZero = new Fractional(3, 0);
            System.out.println("We did NOT succesfully handled deviding by zero. Here is what he got");
            showAllFrac(divZero);
        }catch(IllegalArgumentException err){
            System.out.println("We succesfully handled deviding by zero");
        }

        // Does value work (negative and positive) 

        showAllEx(j);
        showAllEx(i);

        // Does negation work (negative and positive)

        Expression k = new Negate(h);
        Expression l = new Negate(j);

        showAllEx(k);
        showAllEx(l);

        //does Addition work (negative and positive)

        Expression m = new Addition(i, h);
        Expression n = new Value(c);
        Expression o = new Addition(j, n);

        showAllEx(m);
        showAllEx(o);

        //does sumation work (negative and positive)

        Expression p = new Value(f);

        Expression[] expsQ = new Expression[2];
        expsQ[0] = p;
        expsQ[1] = o;
        Expression q = new Sumation(expsQ);

        showAllEx(q);

        Expression r = new Value(e);

        Expression[] expsS = new Expression[2];
        expsS[0] = r;
        expsS[1] = o;
        Expression s = new Sumation(expsS);

        showAllEx(s);

        //does sumation work for less than 2 inputs (negative and positive)

        Expression[] empty = new Expression[0];
        showAllEx(new Sumation(empty));

        Expression[] expT = new Expression[1];
        expT[0] = r;
        Expression t = new Sumation(expT);

        showAllEx(t);

        Expression[] expU = new Expression[1];
        expU[0] = n;
        Expression u = new Sumation(expU);

        showAllEx(u);

        //does sumation work for more than 2 inputs (negative and positive)

        Expression[] expV = new Expression[3];
        expV[0] = r;
        expV[1] = r;
        expV[2] = q;
        Expression v = new Sumation(expV);

        showAllEx(v);

        Expression[] expW = new Expression[4];
        expW[0] = t;
        expW[1] = r;
        expW[2] = r;
        expW[3] = h;
        Expression w = new Sumation(expW);

        showAllEx(w);

        //does subtraction work (negative and positive)

        Expression x = new Subtraction(r, h);
        showAllEx(x);

        Expression y = new Subtraction(i, p);
        showAllEx(y);

        //does multiplication work (negative and positive and zero)

        Expression z = new Value(new Fractional(0));

        Expression aa = new Multiplication(l, z);
        showAllEx(aa);

        Expression ab = new Multiplication(v, s);
        showAllEx(ab);

        Expression ac = new Multiplication(r, p);
        showAllEx(ac);

        //does product work (negative and positive and zero)
        Expression[] expsAD = new Expression[2];
        expsAD[0] = n;
        expsAD[1] = i;
        Expression ad = new Product(expsAD);

        showAllEx(ad);

        Expression[] expsAE = new Expression[2];
        expsAE[0] = z;
        expsAE[1] = o;
        Expression ae = new Product(expsAE);

        showAllEx(ae);

        Expression[] expsAF = new Expression[2];
        expsAF[0] = o;
        expsAF[1] = s;
        Expression af = new Product(expsAF);

        showAllEx(af);
        //does product work for less than 2 inputs (negative and positive)

        showAllEx(new Product(empty));

        Expression[] expsAG = new Expression[1];
        expsAG[0] = j;
        Expression ag = new Product(expsAG);

        showAllEx(ag);

        Expression[] expsAH = new Expression[1];
        expsAH[0] = h;
        Expression ah = new Product(expsAH);

        showAllEx(ah);

        Expression[] expsAI = new Expression[1];
        expsAI[0] = z;
        Expression ai = new Product(expsAI);

        showAllEx(ai);

        //does product work for more than 2 inputs (negative and positive)
        Expression[] expsAJ = new Expression[4];
        expsAJ[0] = ab;
        expsAJ[1] = ad;
        expsAJ[2] = r;
        expsAJ[3] = j;
        Expression aj = new Product(expsAJ);

        showAllEx(aj);

        Expression[] expsAK = new Expression[3];
        expsAK[0] = k;
        expsAK[1] = r;
        expsAK[2] = i;
        Expression ak = new Product(expsAK);

        showAllEx(ak);

        Expression[] expsAL = new Expression[5];
        expsAL[0] = z;
        expsAL[1] = w;
        expsAL[2] = ah;
        expsAL[3] = ae;
        expsAL[4] = s;
        Expression al = new Product(expsAL);

        showAllEx(al);
    }
    }

    private static void showAllEx(Expression ex){
        System.out.print("Expression Type: ");
        System.out.println(ex.name());

        System.out.print("Compiled From: ");
        System.out.println(ex.showStandard());

        System.out.print("Uncompiled From: ");
        System.out.println(ex.showUncompiled());

        System.out.print("Evaluated From: ");
        System.out.println(ex.eval().toString());

        System.out.println("ALL DONE!");
        System.out.println("");

    }

    private static void showAllFrac(Fractional frac){
        System.out.print("Numerator: ");
        System.out.println(frac.numerator());

        System.out.print("Denominator: ");
        System.out.println(frac.denominator());

        System.out.print("String From: ");
        System.out.println(frac.toString());

        System.out.print("Int From: ");
        System.out.println(frac.toInt());

        System.out.print("Float From: ");
        System.out.println(frac.toFloat());

        System.out.print("Reduced From: ");
        System.out.println(frac.reduce().toString());

        System.out.println("ALL DONE!");
        System.out.println("");

    }
}