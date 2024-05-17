package Lab_4;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        String decision;
        double radius;
        double Area;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter YES to find the area of circle :");
        decision=sc1.next().toUpperCase();
        System.out.println("Enter radius of circle :");
        radius=sc2.nextInt();
        if ("YES".equals(decision)){
            Area=(22/7)*radius*radius;
            System.out.println("Area of Circle is : "+Area);
            
        }

    }
    
}
