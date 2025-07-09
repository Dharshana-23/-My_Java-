public class MinMaxTwoNumbers {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 60, 15, 70};
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2 && arr[i] != min1) {
                min2 = arr[i];
            }
        }
        System.out.println("Largest two numbers: " + max1 + " and " + max2);
        System.out.println("Smallest two numbers: " + min1 + " and " + min2);
    }
}
