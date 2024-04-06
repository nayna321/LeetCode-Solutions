class Solution {
    public int lengthOfLongestSubstring(String s) {
        int m = 0, l = 0;
        int[] c = new int[128];
        for (int r = 0; r < s.length(); r++) {
            l = Math.max(l, c[s.charAt(r)]);
            m = Math.max(m, r - l + 1);
            c[s.charAt(r)] = r + 1;
        }
        return m;
    }
}


