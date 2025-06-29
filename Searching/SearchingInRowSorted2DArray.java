import java.util.Arrays;
public class SearchingInRowSorted2DArray {
    public static void main(String[] args) {
        int[][] arr={{1,4,7,10},{23,41,56,60},{6,16,45,100}};
        int target=45;
        int[] result=search(arr,target);//Time Complexity:O(row*log col)
        System.out.println(Arrays.toString(result));
    }
    public static int[] search(int[][] arr,int target){
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            if(target>=arr[i][0] && target<=arr[i][col-1]){
                int j=binarySearch(arr[i],target);
                if (j!=-1) {
                    return new int[]{i,j};
                }
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
