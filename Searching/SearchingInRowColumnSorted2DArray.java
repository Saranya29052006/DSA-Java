import java.util.Arrays;
public class SearchingInRowColumnSorted2DArray {
    public static void main(String[] args) {
        int[][] arr={{5,15,25,30},{7,16,26,31},{10,18,28,35},{20,21,30,40}};
        int target=21;
        int[] result=search(arr,target);//Time Complexity:O(row+col)
        System.out.println(Arrays.toString(result));
    }
    public static int[] search(int[][] arr,int target){
        int row=arr.length;
        int col=arr[0].length;
        int i=0;
        int j=col-1;
        while(i<row && j>=0){
            if(arr[i][j]==target){
                return new int[]{i,j};
            }else if(arr[i][j]<target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }
}
