package CrackYourPlacement;

import java.util.*;

public class threeSum {


    public List<List<Integer>> threeSum(int[] nums) {

        // add your logic here

        List<List<Integer>> st = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> mySet = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third = -(nums[i]+nums[j]);
                if(mySet.contains(third)){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    Collections.sort(temp);
                    st.add(temp);
                }

                mySet.add(nums[j]);




            }


        }

        return st;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        threeSum solution = new threeSum();
        List<List<Integer>> triplets = solution.threeSum(nums);

        System.out.println("Triplets that sum up to zero:");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
