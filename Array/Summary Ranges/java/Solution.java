class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
      
      int i=0;
      while(i<nums.length){
        int j=i;
        while(j+1<nums.length && nums[j+1]==nums[j]+1){
            j++;
        }
        if(i==j){
            list.add(String.valueOf(nums[i]));
        }
        else{
            list.add(String.valueOf(nums[i])+"->"+String.valueOf(nums[j]));
        }
        i=j+1;
      }
      return list;
      
    }
}