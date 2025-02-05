import java.util.Arrays;

class Main {
    public static int KthSmallest(Integer[] array, int k) {
        // Sort the array in ascending order
        Arrays.sort(array);
        
        // Return the k-th smallest element
        return array[k-1];
    }

    public static void main(String[] args) {
        Integer[] array = {100, 45, 34, 98, 65, 78, 99};
        int k = 3;
        
        System.out.println(KthSmallest(array, k));  // Output: 65
    }
}
