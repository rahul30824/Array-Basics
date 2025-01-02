import java.util.Arrays;
class Main{
    public static int[]Solution(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
            if(array[i]>array[j]){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            }
            }
        }
        return array;
    }
  public static void main(String[] args){
      int [] array={1,3,5,4,2,6};
      int[]SortedArray=Solution(array);
      System.out.print("Sorted Array"+Arrays.toString(SortedArray));
  }
}
