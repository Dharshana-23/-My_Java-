import java.util.Scanner;
public class array9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[2][2];
        System.out.println("Enter 4 integer numbers:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter an integer:");
                    scanner.next(); 
                }
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The given array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int[] flat = new int[4];
        int k = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                flat[k++] = arr[i][j];
            }
        }
        k = 3; 
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = flat[k--];
            }
        }
        System.out.println("The reverse of the array is:");
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 2; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println(); 
}      
            }
        }
