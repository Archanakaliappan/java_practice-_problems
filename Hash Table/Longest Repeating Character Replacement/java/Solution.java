class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map= new HashMap<>();
        int maxfreq=0;
        int j=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
            maxfreq=Integer.max(maxfreq,map.get(ch)-1);//expand

        if(i-j-maxfreq>k){// shrink
            map.put(s.charAt(j),map.get(s.charAt(j)));
            j++;
        }
        maxlen=Integer.max(maxlen,i-j+1);
        
        }
        return maxlen;
    }
}