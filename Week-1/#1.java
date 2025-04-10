//Brute Force Approach - using nested for loop

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
	            for(int j = i+1; j<nums.length; j++){
	                if(nums[i]+nums[j] == target){
	                    return new int[]{i,j};
	                }
	            }
	        }
		return new int[]{0,0};
    }
}

//Optimal Approach - Using a HashMap for storing the complement and position of every element.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
	        for(int i=0; i<nums.length; i++) {
	        	int diff = target - nums[i];
	        	if(myMap.containsKey(nums[i])) {
	        		return new int[] {myMap.get(nums[i]),i};
	        	}else {
	        		myMap.put(diff, i);
	        	}
	        }
	        return new int[] {};
    }
}
