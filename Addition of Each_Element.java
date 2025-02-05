import java.util.Arrays;
class Main{
   
    public static int Solution(int []array)
    {
        
        for(int i=0;i<array.length;i++)
        {
            int sum=0;
            for(int j=0;j<i+1;j++)
            {
                
                sum+=array[j];
            }
            System.out.print(sum+" ");
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int[] array={1,2,3,4,5,6,7,8};
        Solution(array);
        
    }
}
