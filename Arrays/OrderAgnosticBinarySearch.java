public class OrderAgnosticBinarySearch {
    public static int binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        boolean isAscending=arr[low]<arr[high];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAscending){
                if(arr[mid]>target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(arr[mid]>target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int[] arr1={50,40,30,20,10,1};
        int target=10;
        int result=binarySearch(arr1,target);
        if(result!=-1){
            System.out.println("Element found at "+result);
        }else{
            System.out.println("Element not found");
        }
    }
}
