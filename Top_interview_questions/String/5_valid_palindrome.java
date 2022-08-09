class Solution {
    public boolean isPalindrome(String s) {
        // 1. remove nonalphanumeric characters and upper cases
        s= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // exclude obvious case
        if(s.equals("")) return true; 
        
        // 2. make it into char array
        char[] charArr = s.toCharArray();
        
        // 3. using two pointer to compare whether two opposite letter is the same. 
        int endPoint= charArr.length-1; 
        
        for(int i=0; i< charArr.length/2+1; i++){
            if(charArr[i] != charArr[endPoint]) return false; 
            --endPoint; 
        }
    
        
        return true; 
    }
}