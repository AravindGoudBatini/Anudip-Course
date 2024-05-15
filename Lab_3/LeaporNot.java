package Lab_3;

public class LeaporNot {
    static void leapOrNot(int number){
        if (number%4==0){//checking leap year for not a century year
            if (number%100==0){//checking leap year for a century year
                if (number%400==0){
                    System.out.println("Leap year");
                }
                else{
                    System.out.println("Not a leapyear");
                }    
            }
            else{
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("Not a leapyear");
        }
    }
    public static void main(String[] args) {
        LeaporNot.leapOrNot(2022);//calling function directly through class name
    }
}
