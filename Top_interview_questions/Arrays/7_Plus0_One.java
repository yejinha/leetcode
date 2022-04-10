class Solution {
    public int[] plusOne(int[] digits) {
        //sol :  if the last digit is not 9,  just plue one to the last digits and return. 
        //       if the last digit is 9, check the previous digit by recursive function. 
        // 마지막 숫자가 9가 아니라면 그냥 +1 해서 리턴, 9 라면 재귀함수로 앞의 숫자들 검사해간다. (앞의 단위 숫자가 9 인경우 또 다음 앞 숫자로 올림 해야하기에 재귀 함수 사용)


        // 공통 로직:  마지막 숫자에 +1
        // common logic : plus one to the last digit. 
        digits[digits.length-1] = digits[digits.length-1] +1; 
        
        // 마지막 숫자 +1 != 10 ->  숫자 올림 필요 없어서 바로 리턴
        // If the last digit + 1 does not exceed 10, return it immediately. 
        if(digits[digits.length-1]!=10){
            return digits;
        }else{
            // 한칸씩 앞으로 가면서 숫자 올림 필요한지 확인
            //check recursively. (example input : {9,9,9} -> {1,0,0,0})
            digits = isUpscale(digits, digits.length-1);
        }
        
        return digits;

    }
    
    //recursive function that check if this index's digit + 1 exceeds 10. 
    // 인덱스와 배열 넣어 앞 단위 숫자 검사하는 함수 
    public int[] isUpscale(int[] digits, int index){
        if(digits[index]==10){
            digits[index]=0;
            if(index -1 >= 0){  // if it has still previous digit, recursive search.   /// 앞의 단위 숫자 남아있으면 계속 재귀 돌림
                digits[index-1]=digits[index-1]+1;
                digits=isUpscale(digits, index-1);   
            }else{ // if the fisrt number (index 0) is 10, make answer array's size increse and deep copy of last digits. 0번째 숫자가 10되면 자릿수 올림해야하기에 배열 크기 늘리고 딥카피
                int[] newDigits = new int[digits.length+1];
                newDigits[0]=1;
                for(int i=1; i<digits.length+1; i++){
                    newDigits[i]=digits[i-1];
                }
                return newDigits;
            }
        }
        return digits;
    }
}