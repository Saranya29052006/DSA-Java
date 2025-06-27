import java.util.Scanner;
public class Two_D_Array{
    String name;
    int rollno;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        //Time complexity O(row*col)=O(n*m)
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //2D Array of Objects
        Two_D_Array[][] arr1=new Two_D_Array[2][2];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=new Two_D_Array();
            }
        }
        System.out.println("Enter name and rollno:");
        sc.nextLine();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j].name=sc.nextLine();
                arr1[i][j].rollno=sc.nextInt();
                sc.nextLine();
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j].name+" "+arr1[i][j].rollno+"   ");
            }
            System.out.println();
        }
    }
}
