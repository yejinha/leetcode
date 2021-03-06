class Solution {
    public int singleNumber(int[] nums) {
        //Runtime: 11 ms
        //Memory Usage: 50.6 MB

        // 배열 길이 1 이면 무조건 첫번째 숫자 리턴
        // array length = 1 -> always return 0th number. 
        if(nums.length == 1){
            return nums[0];
        }
        
        //정렬
        //sort array
        Arrays.sort(nums);
        
        // 같은 숫자는 두 개만 들어있고 싱글 넘버는 하나 뿐이기에 정렬 후에는 홀수 인덱스만 비교해보면 된다.
        // Because the same numbers only contains twice and the single number contains once, you just search only odd indexes after sorting array. 
        // after you sort array
        // index 0 -> only compare with the next number
        // odd indexes (except the last index) -> compare with both sides number
        // if a single number doesn't find after finishing for-loop , return the last index without comparing

        // only for odd indexes
        // 홀수 인덱스만 비교 (마지막 값 제외)
        for(int i=0; i<nums.length-2; i+=2){
            if(i==0){
                if(nums[i]!=nums[i+1]) return nums[i];  //0번째면 다음 값하고만 비교 / if index is zero, compare only with the next value.
            }else{
                if((nums[i]!=nums[i+1])&&(nums[i]!=nums[i-1])){  // 0 아닌 홀수 인덱스는 양 옆값이랑 비교  // if index is not zero and odd, compare both sides. 
                    return nums[i];
                }   
            }
        }
        
        return nums[nums.length-1];
    }
}