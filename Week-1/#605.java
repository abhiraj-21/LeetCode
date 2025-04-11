
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length > 1){
            //case-1: Starting 2 elements are zero
            if(flowerbed[0] == 0 && flowerbed[1] == 0){
                flowerbed[0] = 1;
                n--;
            }
            
            //case-2: Ending 2 elements are zero
            if(flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0){
                flowerbed[flowerbed.length-1] = 1;
                n--;
            }

            //case-3: General Case
            int left = 0;
            int right = left+2;
            while(right < flowerbed.length){
                if(flowerbed[left] == 0 && flowerbed[left] == flowerbed[right]){
                    if(flowerbed[left+1] == 0){
                        flowerbed[left+1] = 1;
                        n--;
                    }
                    left++;
                    right++;
                }
                left++;
                right++;
            }
        }else if(flowerbed.length == 1){
            if(flowerbed[0] == 0){
                flowerbed[0] = 1;
                n--;
            }
        }
        return n<=0;
    }
}
