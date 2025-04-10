// Approach 1 - Converting the string to Character Array

class Solution {
    public int lengthOfLastWord(String s) {
        char[] sArr = s.toCharArray();
	    int len = 0;
        int index = sArr.length-1;
        while(index>=0 && sArr[index] == ' ') {
	        index--;
	    }
        while(index>=0 && sArr[index] != ' ') {
	    	len++;
	    	index--;
	    }
        return len;
    }
}


//Approach 2 - Using Two Pointer

class Solution {
    public int lengthOfLastWord(String s) {
	    int end = s.length()-1;
	    while(end>=0 && s.charAt(end) == ' ') {
	    	end--;
	    }
	    int start = end;
	    while(start>=0 && s.charAt(start) != ' ') {
	    	start--;
	    }
	    return end-start;
	}
}
