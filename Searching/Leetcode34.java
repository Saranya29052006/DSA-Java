class Leetcode34 {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        int lb=low;
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        int ub=low-1;
        if(lb==nums.length || nums[lb]!=target){
            return new int[]{-1,-1};
        }
        return new int[]{lb,ub};
    }
}
