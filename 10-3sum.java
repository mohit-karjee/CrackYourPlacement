package CrackYourPlacement;

class sum3{
    public int search(int[] nums, int target) {
        int left=0;
        int right = nums.length-1;
        
        while(left<=right){
            int mid = left+(right-left)/2;
        if(nums[mid]==target){
            return mid;
        }
        // for left half sorted array!!
        if(nums[left]<=nums[mid]){
            if(target>=nums[left]&&target<nums[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        // for right sorted array!!
        else{
            if(target>nums[mid]&&target<=nums[right]){
                left=mid+1;
            }else{
                right=mid-1;
            }



             }
        


        
        }
        return -1;
    
    }    
    
}
