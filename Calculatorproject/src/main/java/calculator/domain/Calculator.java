
package calculator.domain;

import static java.lang.Math.sqrt;


public class Calculator {
    
    
    public static double add(double x, double y)
    {
        double result = x + y;
        return result;
    }
    public static double sub(double x, double y)
    {
        double result = x-y;
        return result;
    }
    public static double mult(double x, double y)
    {
        double result = x*y;
        return result;
    }
    public static double div(double x, double y)
    {
        double result = x/y;
        return result;
    }
    public static double exp(double x, int y) {
        for (int i = 0; i < y; i++) {
            x = x*x;
        }
        return x;
    }
    
    public static double squareroot(double x) {
        return sqrt(x);
    }
    
    public static double nthRoot(double x, double n) {
        return Math.pow(Math.E, Math.log(x)/n);
    }
    
    

}
