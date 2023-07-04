package CrackYourPlacement;

class maximumSubArray {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Choose between extending the subarray or starting a new subarray
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);

            // Update the maximum subarray sum
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    
}