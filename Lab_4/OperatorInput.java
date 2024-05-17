package Lab_4;
import java.util.Scanner;

public class OperatorInput {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double e;
        double f;
        
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        a=sc1.nextInt();
        b=sc2.nextInt();
        c=a+b;
        d=a-b;
        e=a*b;
        f=a/b;
        System.out.println("Additon :"+c);
        System.out.println("Substration :"+d);
        System.out.println("Multiplication :"+e);
        System.out.println("Division :"+f);
    }
}
