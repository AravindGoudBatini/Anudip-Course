package Lab_9;

import java.util.Scanner;

class Geometry{
	 public static double areaOfRectangle(double length,double breath) {
		return length*breath;
		 
	 }
	 public static double areaOfCircle(double radius,double PI) {
		return PI*radius*radius;
		 
	 }
	 public static double areaOfBox(double length,double breath,double height) {
		return length*height*breath;
	 }
 }
public class AreaCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\nGeometry Calculator");
            System.out.println("1. Calculate area of a rectangle");
            System.out.println("2. Calculate area of a circle");
            System.out.println("3. Calculate volume of a box");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice=sc.nextInt();
            switch (choice) {
			case 1:
				 System.out.print("Enter the length of the rectangle: ");
                 double length = sc.nextDouble();
                 System.out.print("Enter the width of the rectangle: ");
                 double width = sc.nextDouble();
                 System.out.println("Area of the rectangle: " + Geometry.areaOfRectangle(length, width));
                 break;
			case 2:
				System.out.println("Enter the value of Pi:");
				double PI=sc.nextDouble();
				System.out.println("Enter the radius of the circle");
				double radius=sc.nextDouble();
				System.out.println("Area of the Circle : "+ Geometry.areaOfCircle(radius, PI));
				break;
			case 3:
				System.out.println("Enter the length of the Box:");
				double l = sc.nextDouble();
				System.out.println("Enter the breath of the Box:");
				double b = sc.nextDouble();
				System.out.println("Enter the height of the Box:");
				double h = sc.nextDouble();
				System.out.println("Area of the Box:"+Geometry.areaOfBox(l, b, h));
				break;
            case 4:
				System.out.println("Exit");
				break;
	
			default:
				System.out.println("Enter the  valid choice ");
				break;
			}
			
		} while (choice!=4);
		

	}

}
