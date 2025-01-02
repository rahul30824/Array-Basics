import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int []arr={5,4,3,2,1};
        int []newarr=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            newarr[arr.length - 1 - i]=arr[i];
        }
        System.out.print("Reversed array"+Arrays.toString(newarr));
    }
}
