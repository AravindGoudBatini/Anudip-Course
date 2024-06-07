package Lab_7;
import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character :");
        char input=sc.next().charAt(0);
        int asciiValue=(int) input;
        System.out.println("The Ascii value of "+input+" is "+asciiValue);
    }
}
