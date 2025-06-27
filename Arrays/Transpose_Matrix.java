import java.util.Arrays;
public class Transpose_Matrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
        transpose(arr);
    }
    public static void transpose(int[][] arr){
        int[][] transpose=new int[arr[0].length][arr.length];
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                transpose[i][j]=arr[j][i];
            }
        }
        System.out.println(Arrays.deepToString(transpose));
    }
}
