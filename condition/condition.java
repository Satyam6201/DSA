package condition;

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

              // If-else condition:-

        // System.out.println("enter the age of the voter:- ");
        // int age = sc.nextInt();
        // if (age >= 18) {
        //     System.out.println("They are voted in the election!");
        // } else {
        //     System.out.println("They are not voted in the election!");
        // };
        // int a = 199;
        // int b = 16;
        // if (a>=b) {
        //     System.out.println("A is larger of 2 " + (a-b));
        // } else {
        //     System.out.println("B is larger of 2 " + (b-a));
        // }

        // System.out.println("enter the number");
        // int num = sc.nextInt();
        
        // if (num % 2 == 0) {
        //     System.out.println(num + " is a even number");
        // }else{
        //     System.out.println(num + " is a odd number");
        // };

            //  else if :-
        
        // System.out.println("enter the Age:- ");
        // int age = sc.nextInt();

        // if (age >= 5 && age < 14) {
        //     System.out.println("This is a teenager!");
        // }
        // else if (age >= 15) {
        //     System.out.println("This is a Adult man");
        // }
        // else{
        //     System.out.println("child!!");
        // }

        // System.out.print("enter your income:- ");
        // int income = sc.nextInt();
        // int Tax ;

        // if (income < 500000) {
        //     System.out.println("You pay 0% Tax , Your Tex is = " +(Tax = 0));
        // }
        // else if (income >= 500000 && income < 1000000) {
        //     System.out.println("you pay 20% Tax , Your Tex is = " +(Tax = (int)(income*0.2)));
        // }
        // else if (income > 1000000) {
        //     System.out.println("You pay 30% Tax , Your Tex is = " + (Tax = (int)(income*0.3)));
        // }
        // else{
        //     System.out.println("Wrong input");
        // }

        // System.out.println("enter first number");
        // int a = sc.nextInt();
        // System.out.println("enter Second number");
        // int b = sc.nextInt();
        // System.out.println("enter Third number");
        // int c = sc.nextInt();

        // if (a> b && a>c) {
        //     System.out.println("A is greater than all the number");
        // }
        // else if (b >a && b>c ) {
        //     System.out.println("B is greater than all the number");
        // }
        // else if (c > a && c>b) {
        //     System.out.println("C is greater than all tha number");
        // }
        // else{
        //     System.out.println(" ");
        // }

            //     Ternary operation:-


        // System.out.println("enter the number");
        // int num = sc.nextInt();

        // String output = (num % 2==0)? "even": "odd";
        // System.out.println(output);

        // System.out.println("enter the marks of the student");
        // int marks = sc.nextInt();

        // String result = (marks >= 33)? "Pass": "Fail";
        // System.out.println(result);

        //    Switch case:-

        // System.out.println("enter the day:-");
        //  String day = sc.nextLine();

        // switch (day) {
        //     case "sunday" :
        //         System.out.println("1st Day");
        //     break;
        //     case "monday" :
        //         System.out.println("2nd Day");
        //     break;
        //     case "tuesday" :
        //         System.out.println("3rd Day");
        //     break;
        //     case "wednesday" :
        //         System.out.println("4th Day");
        //     break;
        //     case "thursday" :
        //         System.out.println("5th Day");
        //     break;
        //     case "friday" :
        //         System.out.println("6th Day");
        //     break;
        //     case "saturday" :
        //         System.out.println("7th Day");
        //     break;
        //     default:
        //     System.out.println("wrong input!!");
        //         break;
        // }

        System.out.println("enter the number");
        int a = sc.nextInt();
        int b= sc.nextInt();

        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(a+b);
            break;
            case '-':
                System.out.println(a-b);
            break;
            case '*':
                System.out.println(a*b);
            break;
            case '/':
                System.out.println(a/b);
            break;
            case '%':
                System.out.println(a%b);
            break;
        
            default:
                System.out.println("wrong input!!");
            break;
        }
    };
};
