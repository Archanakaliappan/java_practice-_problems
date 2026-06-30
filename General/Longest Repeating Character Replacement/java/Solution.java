1class Solution {
2    public int characterReplacement(String s, int k) {
3        HashMap<Character,Integer> map= new HashMap<>();
4        int maxfreq=0;
5        int j=0;
6        int maxlen=0;
7        for(int i=0;i<s.length();i++){
8            char ch=s.charAt(i);
9            map.put(ch, map.getOrDefault(ch,0)+1);
10            maxfreq=Math.max(maxfreq,map.get(ch));//expand
11
12        while((i-j+1)-maxfreq>k){// shrink
13            map.put(s.charAt(j),map.get(s.charAt(j))-1);
14            j++;
15        }
16        maxlen=Math.max(maxlen,i-j+1);
17        
18        }
19        return maxlen;
20    }
21}