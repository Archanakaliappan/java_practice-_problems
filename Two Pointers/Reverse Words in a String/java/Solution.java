class Solution {
    public String reverseWords(String s) {
        String[] a=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=a.length-1;i>=0;i--){
            sb.append(a[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}