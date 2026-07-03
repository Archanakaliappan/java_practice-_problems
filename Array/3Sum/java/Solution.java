class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int sum=0;
        List<Integer> list =new ArrayList<>();
        for(int i=0;i<3;i++){
              sum+=nums[i];
        }
        List<List<Integer>> ans=new ArrayList<>();
        if(sum==0){
            list.add(nums[0]);
              list.add(nums[1]);
                list.add(nums[2]);
                ans.add(list);
        }
        int l=0;

        for(int i=3;i<nums.length;i++){
            //expand
            sum+=nums[i];
            sum-=nums[l];
           
            if(sum==0){
                list.remove(0);
                list.add(nums[i]);
              ans.add(list);
            }
            l++;
        }
        return ans;
    }
}