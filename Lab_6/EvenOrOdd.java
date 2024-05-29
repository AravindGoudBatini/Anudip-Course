package Lab_6;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if (a%2==0){
            System.out.println("It is Even Number");
        }
        else{
            System.out.println("It is Odd Number");
        }
        
    }
}

