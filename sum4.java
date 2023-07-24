package CrackYourPlacement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum4 {


    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> quadruplets = new ArrayList<>();

        Arrays.sort(nums); // Sort the array to handle duplicates and optimize the solution

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                // Skip duplicate values to avoid duplicates in the result
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    // Skip duplicate values to avoid duplicates in the result
                    continue;
                }


                int left = j + 1;
                int right = nums.length - 1;

                while (left <= right) {
                    int sum = nums[i] + nums[left] + nums[right] + nums[j];

                    if (sum == target) {
                        // Found a valid triplet
                        List<Integer> quadruplet = new ArrayList<>();
                        quadruplet.add(nums[left]);
                        quadruplet.add(nums[i]);
                        quadruplet.add(nums[right]);
                        quadruplet.add(nums[j]);
                        quadruplets.add(quadruplet);
                        // Skip duplicate values for the left pointer
                        while (left<right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        // Skip duplicate values for the right pointer
                        while ( left<right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;


                    }else if (sum < target) {
                        left++;
                    }else {

                        right--;
                    }
                }
            }



        }

        return quadruplets;
    }

        public static void main (String[] args) {
            int[] nums = {1,0,-1,0,-2,2};
            int target=0;
             sum4 solution = new sum4();
            List<List<Integer>> quadruplets = solution.fourSum(nums,target);

            // Print the triplets
            for (List<Integer> quadruplet : quadruplets) {
                System.out.println(quadruplet);
            }
        }
    }


