//Approach-1: Checking the last digit of the array

class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1] != 9){
            digits[digits.length-1]++;
            return digits;
        }
        digits[digits.length-1] = 0;
        int i = digits.length-2;
        while(i>=0){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i]++;
                break;
            }
            i--;
        }
        if(i<0){
            int[] ret = new int[digits.length+1];
            ret[0] = 1;
            for(int j = 1; j<ret.length; j++){  
                ret[j] = 0;
            }
            return ret;
        }
        return digits;
    }
}

//Approach-2: Using Carry

class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length-1; i>=0; i--){
            int check = digits[i] + carry;
            if(check < 10){
                digits[i] += carry;
                carry = 0;
            }else{
                digits[i] = 0;
            }
        }
        if(carry == 1){
            int[] ret = new int[digits.length+1];
            ret[0] = 1;
            for(int i = 1; i<ret.length; i++){
                ret[i] = 0;
            }
            return ret;
        }
        return digits;
    }
}
