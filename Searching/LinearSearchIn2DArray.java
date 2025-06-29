import java.util.Arrays;
public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={{1,6,8,0},{20,10,7,5},{41,30,2,4}};
        int target=30;
        int[] result=linearSearch(arr,target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] linearSearch(int[][] arr,int target){
        //Time Complexity:O(row*col)
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
