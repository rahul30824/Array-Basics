import java.util.HashSet;
class Main
{
    public static  int removeDuplicates(int[] array)
    {
    HashSet<Integer>set=new HashSet<>();
    int j=0;
    for(int i=0;i<array.length;i++)
    {
        if(!set.contains(array[i]))
        {
           set.add(array[i]);
           array[j++]=array[i];
        }
    }
    return j;
}
public static void main(String[] args)
{
  int array[] ={1,2,2,3,4,4,4,5,5};
  int result=removeDuplicates(array);
  for(int j=0;j<result;j++)
  {
      System.out.print(array[j]+" ");
  }
}
}
