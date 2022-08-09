class Solution {
    public int firstUniqChar(String s) {
        int index = 0; 
        boolean check = false; 
        char[] charArray = s.toCharArray(); 
        
        while(index < charArray.length){
            for(int i=0; i < charArray.length; i++){
                // search if the element index is different from loop's index
                if(index != i ){
                     if(charArray[index]==charArray[i]){ // if they find redundant element, search next value
                         break;
                     }   
                }
                
                if(i == charArray.length-1){  // if they don't find any redundant value till the end, return its index
                    return index;
                }
            }
            ++index;
        }
        
        return -1; 
    }
}