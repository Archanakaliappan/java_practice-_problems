class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int k = i + 1;
            int e = nums.length - 1; // Reset 'e' for every new 'i'
            
            while (k < e) {
                int sum = nums[i] + nums[k] + nums[e]; // Calculate fresh sum
                
                if (sum > 0) {
                    e--;
                } else if (sum < 0) {
                    k++;
                } else {
                    // Found a valid triplet
                    list.add(Arrays.asList(nums[i], nums[k], nums[e]));
                    
                    // Skip duplicates for the second element
                    while (k < e && nums[k] == nums[k + 1]) {
                        k++;
                    }
                    // Skip duplicates for the third element
                    while (k < e && nums[e] == nums[e - 1]) {
                        e--;
                    }
                    
                    
                    k++;
                    e--;
                }
            }
        }
        return list;
    }
}