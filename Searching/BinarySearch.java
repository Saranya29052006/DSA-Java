public class BinarySearch {
    public static int binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                high=mid-1; //if descending array here the condition is low=mid+1
            }else{
                low=mid+1; //if descending array here the condition is high=mid-1
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int target=50;
        int result=binarySearch(arr,target);
        if(result!=-1){
            System.out.println("Element found at "+result);
        }else{
            System.out.println("Element not found");
        }
    }
}
