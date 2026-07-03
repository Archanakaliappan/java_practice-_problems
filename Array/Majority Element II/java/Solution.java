class Solution {
    public List<Integer> majorityElement(int[] nums) {
     HashMap<Integer,Integer> map=new HashMap<>();
      int a=nums.length/3;
     List<Integer> list=new ArrayList<>();
     for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
        if(map.get(i)>a){
            list.add(i);
        }
     }   
    
    return list;
    }
}