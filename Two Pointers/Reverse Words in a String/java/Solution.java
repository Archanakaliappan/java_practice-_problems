class Solution {
    public String reverseWords(String s) {
        //a=a+
        s=s.trim();
        String[] word= s.split("\\s+");
        StringBuilder sb=new StringBuilder("");
        int n=word.length;
        for(int i=n-1;i>=0;i--){
            sb.append(word[i]);
            if(i>0)
             sb.append(" ");
        }
        return sb.toString();
    }
}