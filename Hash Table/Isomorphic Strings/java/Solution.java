class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashSet<Character> sset=new HashSet<>();
        HashSet<Character> tset=new HashSet<>();
        for(char i:s.toCharArray()){
            sset.add(i);
        }
         for(char i:t.toCharArray()){
            tset.add(i);
        }
        if(tset.size()!=sset.size()){
            return false;
        }
        return true;
    }
}