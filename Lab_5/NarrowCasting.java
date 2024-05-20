package Lab_5;
public class NarrowCasting{
    public static void main(String[] args) {
        double doubleValue = 1234.56789;
        System.out.println("Original double value: " + doubleValue);

        int intValue = (int) doubleValue; 
        System.out.println("Narrowed int value: " + intValue);
    }
}