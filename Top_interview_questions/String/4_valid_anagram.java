class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length()) return false; //eliminate obvious case. 
        
        // brute force and using native method.
        
//         char[] sArr = s.toCharArray();
//         char[] tArr = t.toCharArray();
        
//         // sort arrays
//         Arrays.sort(sArr);
//         Arrays.sort(tArr);
        
        
//         int index =0;
        
//         // compare whether arrays are exactly the same
//         while(index < s.length()){
//             if(sArr[index] != tArr[index]){
//                 return false; 
//             }    
//             ++index; 
//         }
        
        int[] check = new int[26];
        
        for(int i=0; i<s.length(); i++){
            ++check[s.charAt(i)-'a'];
            --check[t.charAt(i)-'a'];
        }
        
        for(int j=0; j<26; j++){
            if(check[j]!=0) return false; 
        }
        
    
        return true; 
        
    }
}