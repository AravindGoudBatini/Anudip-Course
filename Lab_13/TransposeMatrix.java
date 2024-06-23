package Lab_13;
import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number Of Rows :");
        int row=sc.nextInt();
        System.out.println("Enter the Number Of Columns :");
        int column=sc.nextInt();
        int arr[][]=new int[row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        int transposeMatrix[][]=new int[column][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                transposeMatrix[j][i]=arr[i][j];
            }
        }
        System.out.println("Original Matrix :");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
            System.out.println();
        System.out.println("Transposed Matrix :");
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                System.out.print(transposeMatrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
