class Solution {
    public String longestPalindrome(String s) {
     HashMap<Integer,String> map=new HashMap<>();
     int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String m=s.substring(i,j+1); 
            
                if(rev(m)){
                  map.put(j-i+1,m);
                  max=Integer.max(max,j-i+1);
                }
            }

        }
        return map.get(max);
    }
    boolean rev(String m){
        StringBuilder sb=new StringBuilder();
        sb.append(m);
        sb.reverse();
        if(m.equals(sb.toString())){
            return true;
        }
    return false;
    }
    
}