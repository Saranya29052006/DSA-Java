public class NumberOfOccurrence{
    public static int count(int arr[], int n, int x) {
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        int lb=low;
        low=0;
        high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        int ub=low;
        if(lb==n || arr[lb]!=x){
            return 0;
        }
        return ub-lb;
    }
}
