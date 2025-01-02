import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int arr[]={1,2,3,3,4,5,6,7};
        int pos=3;
        int newarr[]=new int[arr.length-1];
        for(int i=0;i<pos;i++){
            newarr[i]=arr[i];
        }
        for(int i=pos+1;i<arr.length;i++){
            newarr[i-1]=arr[i];
        }
        System.out.print("newarray"+Arrays.toString(newarr));
}
}
