class Solution {
    public boolean canJump(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            boolean canReach = false;
            for (int j = i - 1; j >= 0; j--) {
                if (i - j <= nums[j])
                    canReach = true;
            }
            if (canReach == false)
                return false;
        }
        return true;
    }
}