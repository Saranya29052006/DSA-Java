import java.util.Arrays;
public class SearchInCompletelySortedMatrix {
    public static void main(String[] args) {
        int[][] arr={{5,7,9,10},{12,15,18,30},{31,32,34,35},{38,40,41,43}};
        int target=43;
        int[] result=search(arr,target);//Time Complexity:O(log row+low col)=O(log(row*col))
        System.out.println(Arrays.toString(result));
    }
    public static int[] search(int[][] arr,int target){
        int row=arr.length;
        int col=arr[0].length;
        int rowLow=0;
        int rowHigh=row-1;
        while(rowLow<=rowHigh){
            int rowMid=rowLow+(rowHigh-rowLow)/2;
            if(target>=arr[rowMid][0] && target<=arr[rowMid][col-1]) {
                int j = binarySearch(arr[rowMid], target);
                if (j != -1) {
                    return new int[]{rowMid, j};
                }
            }else if(arr[rowMid][col-1]<target){
                    rowLow=rowMid+1;
            }else{
                    rowHigh=rowMid-1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
