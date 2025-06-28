public class LowerBoundBinarySearch {
  //Time Complexity O(log n)
    public static int lowerBound(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,3,5,9,10};
        int target=2;
        System.out.println(lowerBound(arr,target));
    }
}
