import java.util.Arrays;
public class BidirectionalLinearSearch {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int target=30;
        int result=BidirectionalLinearSearch(arr,target);
        if(result!=-1){
            System.out.println("Element found at "+result);
        }else{
            System.out.println("Element Not found");
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int BidirectionalLinearSearch(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if(arr[left]==target){
                return left;
            }
            if(arr[right]==target){
                return right;
            }
            left++;
            right--;
        }
        return -1;
    }
}
