class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       int s=0;
       int sum=0;
       int max=0;
       HashSet<Integer> set=new HashSet<>();
       for(int e=0;e<nums.length;e++){
        while(set.contains(nums[e])){
            set.remove(nums[s]);
            sum-=nums[s];
            s++;
        }
        set.add(nums[e]);
        sum+=nums[e];
        max=Math.max(sum,max);
       }
       return max;
    }
}