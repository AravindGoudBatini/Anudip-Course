package Lab_7;
import java.util.Scanner;

public class Calculator {
    private static double getValidNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean continuecalculate=true;
        while(continuecalculate){
        double number1=getValidNumber(sc,"Enter 1st number :" );
        double number2=getValidNumber(sc,"Enter 2nd number :" );
        System.out.println("Enter the operator to be used (+,-,*,/) :");
        String choice=sc.next();
        switch (choice) {
            case "+":
                double sum=number1+number2;
                System.out.println("Addition :"+sum);
                break;
            case "-":
                double difference=number1-number2;
                System.out.println("Substraction :"+difference);
                break;
            case "*":
                double product=number1*number2;
                System.out.println("Multiplication :"+product);
                break;
            case "/":
                double quotient=number1/number2;
                if (number2==0){
                    System.out.println("Error tried division using 0 ");
                    break;
                }
                System.out.println("Division :"+quotient);
                break;
            default:
                System.out.println("Enter proper Operator");
                break;
            
        }
        System.out.println("Do you want to continue Calculation type (yes/no) :");
        String answer=sc.next();
        if(answer.equalsIgnoreCase("no")){
            continuecalculate=false;
        }
    }

    }
    
}
