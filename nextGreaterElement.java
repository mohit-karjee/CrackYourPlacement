package CrackYourPlacement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        // Find the next greater element for each element in nums2
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek())
                map.put(stack.pop(), num);
            stack.push(num);
        }

        // Build the result array using the mapping from nums2
        int i = 0;
        for (int num : nums1)
            result[i++] = map.getOrDefault(num, -1);
        return result;
    }



        public static void main(String[] args) {
            int[] nums1 = {4, 1, 2};
            int[] nums2 = {1, 3, 4, 2};

            nextGreaterElement solution = new nextGreaterElement();
            int[] result = solution.nextGreaterElement(nums1, nums2);

            System.out.println("Input nums1: " + Arrays.toString(nums1));
            System.out.println("Input nums2: " + Arrays.toString(nums2));
            System.out.println("Next Greater Elements: " + Arrays.toString(result));
        }
    }


