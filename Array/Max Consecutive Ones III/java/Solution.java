class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int z=0;
        int max=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                z++;
            }
            while(z>k && l<=r){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }
            max=Integer.max(max,r-l+1);
        
        }
        return max;
    }
}