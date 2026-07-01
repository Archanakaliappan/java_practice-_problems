class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
         comb(candidates,target,0,ans,list);
         return ans;
    }
    public void comb(int arr[],int t,int indx,List<List<Integer>> ans,List<Integer> list){
  if(t==0){
    ans.add(new ArrayList<>(list));
    return;
  }
  if(t<0 || indx==arr.length){
    return;
  }
  //skip the next indx
    list.add(arr[indx]);
    comb(arr,t-arr[indx],indx,ans,list);
    list.remove(list.size()-1);
    comb(arr,t,indx+1,ans,list);
   
    }
}