package Lab_3 ;

class Palindrome {
    static void palindromeFn(int number){
        int temp;
        int remainder,reversednumber=0;
        temp=number;
        while(number>0){
            remainder=number%10;//getting remainder
            reversednumber=reversednumber*10+remainder;//adding remainder to get reversed number
            number=number/10;

        }
        if (temp==reversednumber){//checking if reversed number is a palindrome or not
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        
    }
    public static void main(String[] args) {
        Palindrome.palindromeFn(45);
    }
}
