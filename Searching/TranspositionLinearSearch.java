import java.util.Arrays;
public class TranspositionLinearSearch {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int target=50;
        int result=transpositionLinearSearch(arr,target);
        if(result!=-1){
            System.out.println("Element found at "+result);
        }else{
            System.out.println("Element Not found");
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int transpositionLinearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                if(i>0){
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                }
                return i;
            }
        }
        return -1;
    }
}
