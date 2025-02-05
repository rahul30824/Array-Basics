import java.util.Arrays;

class Main {
    public static int KthLargest(Integer[] array, int k) {
        // Sort the array in ascending order
        Arrays.sort(array);
        
        // Return the k-th smallest element
        return array[array.length-k];
    }

    public static void main(String[] args) {
        Integer[] array = {100, 45, 34, 98, 65, 78, 99};
        int k = 3;
        
        System.out.println(KthLargest(array, k));  
    }
}
