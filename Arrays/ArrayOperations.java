import java.util.Scanner;
import java.util.Arrays;
public class ArrayOperations{
    //Array Traversal O(n)
    public static void traversal(int[] arr){
        int size=0;
        for(int i:arr){
            if(i!=Integer.MIN_VALUE){
                size++;
            }else{
                break;
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //Array Insertion At Beginning O(n)
    public static void insertBegin(int[] arr,int x){
        int size=0;
        for(int i:arr){
            if(i!=Integer.MIN_VALUE){
                size++;
            }else{
                break;
            }
        }
        for(int i=size;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=x;
    }
    //Array Insertion At Specific Position O(n)
    public static void insertPosition(int[] arr,int x,int pos){
        int size=0;
        for(int i:arr){
            if(i!=Integer.MIN_VALUE){
                size++;
            }else{
                break;
            }
        }
        if(pos<=0||pos>(size+1)){
            System.out.println("Position is not in the valid range.");
        }else{
            for(int i=size;i>pos-1;i--){
                arr[i]=arr[i-1];
            }
            arr[pos-1]=x;
        }
    }
    //Array Insertion At End O(1)
    public static void insertEnd(int[] arr,int x){
        int size=0;
        for(int i:arr){
            if(i!=Integer.MIN_VALUE){
                size++;
            }else{
                break;
            }
        }
        arr[size]=x;
    }
    //Array Deletion At Beginning O(n)
    public static void deleteBegin(int[] arr){
        int size=0;
        for(int i:arr){
            if(i!=Integer.MIN_VALUE){
                size++;
            }else{
                break;
            }
        }
        for(int i=0;i<size;i++){
            arr[i]=arr[i+1];
        }
    }
    //Array Deletion At Specific Position O(n)
    public static void deletePosition(int[] arr,int pos){
        int size=0;
        for(int i:arr){
            if(i!=Integer.MIN_VALUE){
                size++;
            }else{
                break;
            }
        }
        if(pos<=0||pos>size){
            System.out.println("Position is not in the valid range.");
        }else{
            for(int i=pos-1;i<size;i++){
                arr[i]=arr[i+1];
            }
        }
    }
    //Array Deletion At End O(1)
    public static void deleteEnd(int[] arr){
        int size=0;
        for(int i:arr){
            if(i!=Integer.MIN_VALUE){
                size++;
            }else{
                break;
            }
        }
        arr[size-1]=Integer.MIN_VALUE;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[50];
        Arrays.fill(arr,Integer.MIN_VALUE);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        traversal(arr);
        insertBegin(arr,3);
        traversal(arr);
        insertPosition(arr,6,2);
        traversal(arr);
        insertEnd(arr,10);
        traversal(arr);
        deleteBegin(arr);
        traversal(arr);
        deletePosition(arr,2);
        traversal(arr);
        deleteEnd(arr);
        traversal(arr);
    }
}
