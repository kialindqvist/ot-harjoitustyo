
package calculator.ui;

import java.util.Scanner;
import calculator.domain.Calculator;



public class Ui {
    
    private Scanner lukija;
    private Calculator calculator;
    
    public Ui() {
        this.lukija = new Scanner(System.in);
        this.calculator = new Calculator();
        
    }
    
    public void start() {
        System.out.println("Calculator");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("[1] add");
            System.out.println("[2] substract");
            System.out.println("[3] multiply");
            System.out.println("[4] diverse");
            System.out.println("[5] power");
            System.out.println("[6] square root");
            System.out.println("[7] nth root");
            System.out.println("[x] quit");

            System.out.print("> ");
            String answer = lukija.nextLine();
            
            if(answer.equals("6")) {
                System.out.println("Give x which square root is going to be taken from");
                System.out.println("x = ");
                double x = Double.valueOf(lukija.nextLine());
                System.out.println("sqrt(" + x + ") = " + this.calculator.squareroot(x));
                
                
                
            } if(answer.equals("x")) {
                break;
                
            }else {
                System.out.println("Give x and y to the opetation x['the chosen operation']y");
                System.out.println("x = ");
                double x = Double.valueOf(lukija.nextLine());
                System.out.println("y = ");
                int y = Integer.valueOf(lukija.nextLine());
            

                if (answer.equals("1")) {
                    System.out.println(x + "+" + y +" = " + this.calculator.add(x,y));
                } else if (answer.equals("2")) {
                    System.out.println(x + "-" + y +" = " + this.calculator.sub(x,y));
                } else if (answer.equals("3")) {
                    System.out.println(x + "*" + y +" = " + this.calculator.mult(x,y));
                } else if (answer.equals("4")) {
                    System.out.println(x + "/" + y +" = " + this.calculator.div(x,y));
                } else if (answer.equals("5")) {
                    System.out.println(x + "^" + y +" = " + this.calculator.exp(x,y));
                } else if (answer.equals("7")) {
                    System.out.println(y+ "th root of " + x + " is " + this.calculator.nthRoot(x,y));
                }
            }
        }
    }
    
}
