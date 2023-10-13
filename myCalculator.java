public class myCalculator {
    // here is where i create my class called calculator ^^

    // these are my instance fields where i define variables that will come up later on
    double num1;
    double num2;
    double answer;
    
    // this is my method that does addition
    public void addition(double num1, double num2){
        answer = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + answer +".");
    }

    // this is my method that does subtraction
    public void subtraction(double num1, double num2){
        answer = num1 - num2;
        System.out.println("The difference between " + num1 + " and " + num2 + " is " + answer +".");
    }

    // this is my method that does multiplication
    public void multiplication(double num1, double num2){
        answer = num1*num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is " + answer +".");
    }

    // this is my method that does division
    public void division(double num1, double num2){
        answer = num1/num2;
        System.out.println("The quotient of " + num1 + " and " + num2 + " is " + answer +".");
    }
    
    // this is my method that finds the remainder when doing division
    public void modulo(double num1, double num2){
        answer = num1%num2;
        System.out.println("The remainder of " + num1 + " divided by " + num2 + " is " + answer +".");
    }

    // this is the main method. please replace the numbers assigned below to use the calculator
    public static void main(String args[]) {
        // this is where i get the calculator to run
        myCalculator calc = new myCalculator();

        // if you want to do addition, replace the two numbers here and un-comment the statement below
        calc.addition(4,5);

        // if you want to do subtraction, replace the two numbers here and un-comment the statement below
        calc.subtraction(4,5);

        // if you want to do multiplication, replace the two numbers here and un-comment the statement below
        calc.multiplication(4,5);

        // if you want to do division, replace the two numbers here and un-comment the statement below
        calc.division(4,5);

        // if you want to find a remainder, replace the two numbers here and un-comment the statement below
        calc.modulo(4,5);

    }
}
