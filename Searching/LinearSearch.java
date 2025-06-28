public class LinearSearch {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int target=50;
        int result=linearSearch(arr,target);
        if(result!=-1){
            System.out.println("Element found at "+result);
        }else{
            System.out.println("Element Not found");
        }
    }
    public static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
