class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int sum=0;
      
        List<List<Integer>> list=new ArrayList<>();
       
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
              int k=i+1;
               int e=nums.length-1;
            while(k<e){
                  sum=nums[i]+nums[k]+nums[e];
                  if(sum>0){
                    e--;
                  }
                  else if(sum<0){
                   k++;
                  }
                  else if(sum==0){
                  list.add(Arrays.asList(nums[i],nums[k],nums[e]));
                  k++;
                  }
                  while (nums[k] == nums[k-1] && k< e) {
                        k++;
                        e--;
                    }
            }
        }
        return list;
    }
}