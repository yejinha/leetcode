class Solution {
    public void moveZeroes(int[] nums) {
        // 포인터 두 개를 사용해 배열을 한번만 돌도록 한다. 
        //sol: using two pointer
        int first =0;
        int second =1; 

        // saved value for switching index
        // 자리 바꿀 때 임시로 값 저장할 변수
        int saved =0;
        
        while(second < nums.length){
            // 0 이 0 아닌 숫자 앞에 있는 경우만 자리 바꾼다.
            if(nums[first]==0 && nums[second]!=0){  // if zero is in front of non-zero value, switch
                saved = nums[first];
                nums[first]=nums[second];
                nums[second] = saved;
                ++first;
                ++second;
            // 0 아닌 수가 앞에 있다면 인덱스 증가시킴 (자리 바꿀 필요 없음)
            }else if(nums[first]!=0){  // if non zero is in front of zero, you don't have to switch. Just move two pointers forward. 
                ++first;
                ++second;
            // 0 끼리 비교 -> 첫번째 0 자리 기억하기 위해 두번째 포인터만 증가시킴 
            }else{  // if you compare two zero numbers, move second pointer forward to remember first zero number's index. 
                ++second;
            }
        }
           
    }
}