import java.util.Scanner;
public class JaggedArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size:");
        int row=sc.nextInt();
        int[][] arr=new int[row][];
        //Time complexity O(row*col)
        for(int i=0;i<row;i++){
            System.out.println("Enter col size:");
            int col=sc.nextInt();
            arr[i]=new int[col];
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
