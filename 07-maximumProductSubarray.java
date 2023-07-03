package CrackYourPlacement;

class Solution {
    public int maxProduct(int[] nums) {
       int maxSoFar = nums[0];
        int maxEndHere = nums[0];
        int minEndHere = nums[0]; // Track the minimum product as well
        
        for (int i = 1; i < nums.length; i++) {
            int tempMaxEndHere = maxEndHere; // Store the previous maxEndHere value
            
            // Update maxEndHere and minEndHere
            maxEndHere = Math.max(nums[i], Math.max(maxEndHere * nums[i], minEndHere * nums[i]));
            minEndHere = Math.min(nums[i], Math.min(tempMaxEndHere * nums[i], minEndHere * nums[i]));
            
            // Update maxSoFar
            maxSoFar = Math.max(maxSoFar, maxEndHere);
        }
        
        return maxSoFar;
    }
}
