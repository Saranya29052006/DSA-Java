import java.util.Arrays;
public class Multiply_Matrix {
    public static void main(String[] args){
        int[][] arr1={{1,2,3},{4,5,6}};
        int[][] arr2={{1,2},{3,4},{5,6}};
        if(arr1[0].length!=arr2.length){
            System.out.println("Cannot mutiply this matrix");
        }else{
            int row=arr1.length;
            int col=arr2[0].length;
            int row_col=arr1[0].length;
            int[][] result=new int[row][col];
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    for(int k=0;k<row_col;k++){
                        result[i][j]+=(arr1[i][k]*arr2[k][j]);
                    }
                }
            }
            System.out.println(Arrays.deepToString(result));
        }
    }
}
