import java.util.Arrays;
public class LinearSearch {
    public static void MoveToFrontLinearSearch(String[] args){
        int[] arr={10,20,30,40,50};
        int target=30;
        int result=MoveToFrontLinearSearch(arr,target);
        if(result!=-1){
            System.out.println("Element found at "+result);
        }else{
            System.out.println("Element Not found");
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int MoveToFrontLinearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                if(i>0){
                    /*int temp=arr[i];
                    arr[i]=arr[0];
                    arr[0]=temp;*/
                    int element=arr[i];
                    for(int j=i;j>0;j--){
                        arr[j]=arr[j-1];
                    }
                    arr[0]=element;
                }
                return i;
            }
        }
        return -1;
    }
}
