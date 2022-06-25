class Solution {
    public int reverse(int x) {
        
        boolean isNegative = false; 
        
        // 1. check if it is negative -> true : make it absolute value and remember it is a negative value
        // 2. check if it is the Minimum value -> cause it can't be reversed. (range problem)
        
        if(x < 0) {
            isNegative = true; 
            if(x == Integer.MIN_VALUE){
                return 0;
            }
            x= Math.abs(x);
        }
        
        // 3. make it StringBuffer to reverse easily. 
        String strInput = String.valueOf(x);
        StringBuffer sb = new StringBuffer(strInput);
        
        //reverse it to double value. (bc. check if it fits in a signed 32 bit range)
        double doubleResult = justReverse(sb);
        
        //check Range (all possible outcome)
        if(isNegative){
            if(doubleResult > 2147483648L){
                return 0; 
             }
        }else{
            if(doubleResult > 2147483647){
                return 0; 
             }
        }
        
        // make it integer value for solution format 
        int result = (int) doubleResult; 
        
        if(isNegative) return -result; 
        
        return result; 
        
    }
    
    // just reverse input directly
    public Double justReverse (StringBuffer inputSb){
        if(inputSb.charAt(inputSb.length()- 1) == '0'){
            inputSb= trimZeroes(inputSb);
        }
        String reversed = inputSb.reverse().toString();
  
        return Double.parseDouble(reversed);
    }
    
    // trim 0 at the end 
    public StringBuffer trimZeroes (StringBuffer inputSb){
        for(int i =(inputSb.length()-1); i>0; i--){
            if(inputSb.charAt(i)=='0'){
                inputSb.deleteCharAt(i);
            }else{
                break;
            }
        }
        return inputSb; 
    }
}