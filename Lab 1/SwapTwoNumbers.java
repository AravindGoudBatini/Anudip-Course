public class SwapTwoNumbers {


    public static void main(String[] args)
    {
        int x = 25;
        int y = 2552;
    
        System.out.println("Before swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    
        x = x + y;
        y = x - y;
        x = x - y;
    
        System.out.println("After swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Addition :"+(x+y));
    }
    
    }
