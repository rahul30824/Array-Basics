class Main{
    public static int Secondlargest(int [] array)
    {
      int first=array[0];
      int second=array[0];
      for(int i=0;i<array.length;i++)
      {
          if(array[i]>first)
          {
              second=first;
              first=array[i];
          }
          else if(array[i]>second)
          {
              second=array[i];
          }
      }
      System.out.print("The SecondLargest Element is"+second);
      return second;
    }
    public static void main(String[] args)
    {
        int[] array={1,2,3,4,5};
        Secondlargest(array);
    }
}
