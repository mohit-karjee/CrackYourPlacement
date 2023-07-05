package CrackYourPlacement;
import java.util.HashMap;
import java.util.Map;
public class subArraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> sumFreq = new HashMap<>();
        sumFreq.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sumFreq.containsKey(sum - k)) {
                count += sumFreq.get(sum - k);
            }
            sumFreq.put(sum, sumFreq.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

        public static void main(String[] args) {
            subArraySum solution = new subArraySum();

            int[] nums = {1, 1, 1};
            int k = 2;
            int count = solution.subarraySum(nums, k);
            System.out.println("Count of subarrays with sum " + k + ": " + count);
        }
    }


