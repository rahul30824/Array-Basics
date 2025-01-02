import java.util.Arrays;
class Main{
  public static void main(String[] args){
      int pos1=3;
      int pos2=5;
      int ele1=4;
      int ele2=7;
      int []arr={1,2,3,5,6};
      int[]newarr=new int[arr.length+2];
      
      for(int i=0;i<pos1;i++){
          newarr[i]=arr[i];
      }
      
      newarr[pos1]=ele1;
      
      for(int i=pos1;i<pos2;i++){
          newarr[i+1]=arr[i];
      }
      newarr[pos2+1]=ele2;
      for(int i=pos2+1;i<arr.length;i++){
          newarr[i+1]=arr[i];
      }
      System.out.print("New array"+Arrays.toString(newarr));
  }
}
