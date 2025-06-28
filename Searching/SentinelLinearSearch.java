import java.util.Arrays;
public class SentinelLinearSearch {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int target=50;
        int result=SentinelLinearSearch(arr,target);
        if(result!=-1){
            System.out.println("Element found at "+result);
        }else{
            System.out.println("Element Not found");
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int SentinelLinearSearch(int[] arr,int target){
        int n=arr.length;
        int last=arr[n-1];
        arr[n-1]=target;
        int i=0;
        while(arr[i]!=target){
            i++;
        }
        arr[n-1]=last;
        if(i<n-1||arr[i]==target){
            return i;
        }
        return -1;
    }
}
