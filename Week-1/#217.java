//Optimal Approach - Using Set property of not having similar elements

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
		for(int i : nums) {
			if(!s.add(i)) {
				return true;
			}
		}
		return false;
    }
}
