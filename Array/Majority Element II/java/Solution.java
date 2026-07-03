class Solution {
    public List<Integer> majorityElement(int[] nums) {
     HashMap<Integer,Integer> map=new HashMap<>();
      int a=nums.length/3;
     HashSet<Integer> list=new HashSet<>();
     List<Integer> set=new ArrayList<>();
     for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
        if(map.get(i)>a){
            list.add(i);
        }
     }   
    for(int i:list){
        set.add(i);
    }
    return set;
    }
}