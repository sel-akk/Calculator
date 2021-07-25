package calculator;

import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int sub(int a, int b){
        int dif = a - b;
        return dif;
    }

    public static int mul(int a, int b){
        int pro = a * b;
        return pro;
    }

    public static float div(int a, int b){
        float quo = a / b;
        return quo;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Welcome to the my simple calculator, choose 2 integers and an operation between them");

        System.out.println("Choose an operation: ");
        String ope = scan.nextLine();  // Read user input

        System.out.println("Enter a first integer a: ");
        int a = scan.nextInt();

        System.out.println("Enter a second integer b: ");
        int b = scan.nextInt();

        scan.close();

        Calculator calc = new Calculator();

        if(ope.equals("add")){

            int result = calc.add(a, b);
            System.out.println("The result of the operation is " + result);

        }

        else if(ope.equals("subtract")){

            int result = calc.sub(a, b);
            System.out.println("The result of the operation is " + result);

        }

        else if(ope.equals("multiply")){

            int result = calc.mul(a, b);
            System.out.println("The result of the operation is " + result);

        }

        else if(ope.equals("divide")){

            float result = calc.div(a, b);
            System.out.println("The result of the operation is " + result);

        }

        else{
            System.out.println("Invalid operation input");
        }

    }
}
