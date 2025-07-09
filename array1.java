public class array1 {
    public static void main(String[] args) {
  
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = (double) sum / i;
        System.out.println("Sum of array: " + sum);
        System.out.println("Average of array: " + average);
    }
}
