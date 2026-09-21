class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>(); 
        boolean check=false;
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(!set.contains(e.getValue())){
                set.add(e.getValue());
            }
            else{
                check=true;
                break;
            }
        }
        if(check){
            return false;
        }
        else{
            return true;
        }
    }
}