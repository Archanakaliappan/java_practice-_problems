class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        boolean u[]=new boolean[nums.length];
        perUni(nums,u,list,ans);
        return ans;
    }
    public void perUni(int nums[],boolean u[],List<Integer> list,List<List<Integer>> total){
        if(list.size()==nums.length){
            total.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(u[i]){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] && !u[i-1]){
                continue;
            }
            list.add(nums[i]);
            u[i]=true;
            perUni(nums,u,list,total);
            //backtracking
            list.remove(list.size()-1);
            u[i]=false;
        }
    }
}