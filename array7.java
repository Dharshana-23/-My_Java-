public class array7 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40, 50, 30};
        int n = arr.length;
        int[] unique = new int[n];
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                unique[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
