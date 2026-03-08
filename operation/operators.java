package operation;

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
            //  Arithmetic operators(Binary operation):-

        System.out.println("plus " + (x+y));
        System.out.println("sub " + (x-y));
        System.out.println("mul "+x*y);
        System.out.println("div "+x/y);
        System.out.println("mod "+x%y);
  
            //  Arithematic opertaion(Unary operation):-

        System.out.println("post increment " + x++);
        System.out.println(x);
        System.out.println("pre increment " + ++x);
        System.out.println(x);

        System.out.println("post decrement " + y--);
        System.out.println(y);
        System.out.println("pre decrement "+ --y);
        System.out.println(y);

            // relation operator:-

        System.out.println("x is greater than y " + (x>y));
        System.out.println("y is greater than x " + (x<y));
        System.out.println("Not equal to " + (x != y));
        System.out.println("equal to " + (x==y));
        System.out.println("x is greater than equal to " + (x >= y));
        System.out.println("y is greater than equal to " + (x<= y));

           //  Logical operator:-

        System.out.println("And operators " + ((x>y) && (x<y)));
        System.out.println("Or operators " + ((x>y) || (x<y)));
        System.out.println("Not operators " + ((x>y) != (x<y)));
         
          //  Assignment operator:-

        System.out.println("value of x is " +x);    
        System.out.println( x += 10);
        System.out.println("value of y is " + y);
        System.out.println( y -= 3);
    };
};
