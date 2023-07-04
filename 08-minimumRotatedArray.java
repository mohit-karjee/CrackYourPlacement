package CrackYourPlacement;

class minRotated {
    public int findMin(int[] nums) {
        return findMinRecursive(nums,0,nums.length-1);
    }
    private int findMinRecursive(int[] nums,int left,int right){
        
        if(nums[left]==nums[right])
        return nums[left];
        int mid=left+(right-left)/2;
        if(nums[mid]>nums[right]){
            return findMinRecursive(nums,mid+1,right);
        }else{
            return findMinRecursive(nums,left,mid);
        }

    }
}