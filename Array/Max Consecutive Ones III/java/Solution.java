class Solution {
    public int longestOnes(int[] nums, int k) {
        int e=0;
        int s=0;
        int z=0;
        while(e<nums.length){
            if(nums[e]==0){//if val is zero
                z++;
            }
            e++;
            if(z>k){
                if(nums[s]==0){
                    z--;
                }
                s++;
            }
        }
        return e-s;
    }
}