import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums == null || nums.length < 4) return list;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int l = j + 1;
                int e = nums.length - 1;

                while (l < e) {
                    // Only one definition of 'sum' here to avoid the duplicate variable error
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[e];

                    if (sum > target) {
                        e--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        list.add(Arrays.asList(nums[i], nums[j], nums[l], nums[e]));

                        // FIXED: Added the missing "&&" and fixed "enums" typo
                        while (l < e && nums[l] == nums[l + 1]) {
                            l++;
                        }
                        while (l < e && nums[e] == nums[e - 1]) {
                            e--;
                        }

                        l++;
                        e--;
                    }
                }
            }
        }
        return list;
    }
}