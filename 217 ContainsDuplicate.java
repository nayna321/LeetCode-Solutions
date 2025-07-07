class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> isDuplicate = new HashSet<>();
        for(int num : nums){
            if(isDuplicate.contains(num))
                return true;
            isDuplicate.add(num);
        }
        return false;
    }
}
