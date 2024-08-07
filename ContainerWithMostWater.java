class Solution {
    public int maxArea(int[] height) {
        int n = height.length, ans = 0,res = 0;
        int i = 0, j = n-1;
        while(i < j){
            ans = Math.min(height[i], height[j]);

            res = Math.max(res, ans*(j-i));

            while(height[i]<=ans && i<j) i++;
            while(height[j]<=ans && i<j) j--;
        }
        return res;
    }
}
