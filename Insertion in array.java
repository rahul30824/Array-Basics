import java.util.Arrays;
class Main{
    public static void main(String[] args){
        int [] arr={1,2,3,5,6};
        int position=3;
        int element=4;
        int[] newArr=new int[arr.length+1];
        for(int i=0;i<position;i++){
            newArr[i]=arr[i];
        }
        newArr[position]=element;
        for(int i=position;i<arr.length;i++){
            newArr[i+1]=arr[i];
        }
        System.out.println("Final"+Arrays.toString(newArr));
        
    }
    }
