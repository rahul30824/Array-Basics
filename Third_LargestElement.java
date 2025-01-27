class Main{
    public static int ThirdLargestElement(int[] array)
    {
        int first=array[0];
        int second=array[0];
        int third=array[0];
        
     for(int i=0;i<array.length;i++)  
     {
         if(array[i]>first)
         {
             third=second;
             second=first;
             first=array[i];
         }
         else if(array[i]>second)
         {
             third=second;
             second=array[i];
         }
         else{
             third=array[i];
         }
     }
      System.out.print("Third Largest Element"+third);
     return third;
    
    }
    public static void main(String[] args)
    {
      int[] array={1,2,3,4,5};
      ThirdLargestElement(array);
      
    }
}
