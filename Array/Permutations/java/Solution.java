class Solution {
    public List<List<Integer>> permute(int[] nums) {
       boolean arr[]=new boolean[nums.length];
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        per(nums,arr,list,ans);
        return ans;}

void per(int nums[],boolean arr[],List<Integer> list,List<List<Integer>> total){
    if(list.size()==arr.length){
        total.add(new ArrayList<>(list));
        return;
    }

    for(int i=0;i<nums.length;i++){
        if(arr[i]){
            continue;
        }
        list.add(nums[i]);
        arr[i]=true;
        per(nums,arr,list,total);
        //backtracking
        list.remove(list.size()-1);
        arr[i]=false;
    }

}

    }
