class Leetcode74{
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int rowLow=0;
        int rowHigh=row-1;
        while(rowLow<=rowHigh){
            int rowMid=rowLow+(rowHigh-rowLow)/2;
            if(target>=matrix[rowMid][0] && target<=matrix[rowMid][col-1]){
                int j=binarySearch(matrix[rowMid],target);
                if(j!=-1){
                    return true;
                }
            }
            if(target>matrix[rowMid][col-1]){
                rowLow=rowMid+1;
            }else{
                rowHigh=rowMid-1;
            }
        }
        return false;
    }
    public int binarySearch(int[] arr,int target){
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
