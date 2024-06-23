package Lab_13;
import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Elements :");
        int row=sc.nextInt();
        int arr[]=new int[row];
        System.out.println("Enter the Elements in array :");
        for (int i=0;i<row;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Array :");
        for (int i=0;i<row;i++){
            System.out.print(arr[i]+" "); 
        }
        System.out.println();
        int sum=0;
        for (int i=0;i<row;i++){
            if (arr[i]%2 !=0){
                sum+=arr[i];
            } 
        }
        System.out.println("Sum Of ODD Numbers in a Array :"+sum);
    }
}
