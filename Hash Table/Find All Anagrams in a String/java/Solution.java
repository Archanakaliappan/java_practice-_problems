class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int l = 0;
        int s1 = s.length();
        int s2 = p.length();
        if (s1 < s2) {
            return new ArrayList<>();
        }
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s2; i++) {
            arr1[s.charAt(i) - 'a']++;
            arr2[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(arr1, arr2)) {
            list.add(l);
        }
        for (int i = s2; i < s1; i++) {
            //expand
            arr1[s.charAt(i) - 'a']++;
            arr1[s.charAt(l) - 'a']--;//shrink
            l++;
            if (Arrays.equals(arr1, arr2)) {
                list.add(l);
            }

        }
        return list;
    }
}