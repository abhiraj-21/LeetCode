//Using the frequencies of 0,1 & 2

class Solution {
    public void sortColors(int[] nums) {
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;
      //Loop to check the frequencies of every color
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                redCount++;
            }else if(nums[i] == 1){
                whiteCount++;
            }else{
                blueCount++;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(redCount > 0){
                nums[i] = 0;
                redCount--;
            }else if(whiteCount > 0){
                nums[i] = 1;
                whiteCount--;
            }else{
                nums[i] = 2;
                blueCount--;
            }
        }
    }
}

//We can also use HashMap to store the frequencies
