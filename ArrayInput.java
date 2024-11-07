import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Row");
        int row = sc.nextInt();
        System.out.println("Enter column");
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is.....");
        for(int i=0; i<row;i++){
            for(int j=0; j<column; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
