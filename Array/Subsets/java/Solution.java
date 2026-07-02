class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        subset(nums,0,list,ans);
        return ans;
    }
    void subset(int arr[],int indx,List<Integer> list,List<List<Integer>> ans){
        if(indx==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        subset(arr,indx+1,list,ans);
        list.add(arr[indx]);
        //backtracking
        subset(arr,indx+1,list,ans);
        list.remove(list.size()-1);
    }
}