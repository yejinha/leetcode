class Solution {
    public int[] twoSum(int[] nums, int target) {
      
        // solution : using two pointer array
        // time compacity : O(N^2) space compacity : O(1)
        // 투 포인터로 해결 
        // Runtime: 130 ms
        // Memory Usage: 42.6 MB

        int index1 =0;
        int index2=1;
        int results[] = new int[2];
        
         if(nums.length == 2){
            return new int[]{0,1};
        }
        
        // 포인터 하나로 기준 값 정한 후 다른 포인터 옮겨가면서 비교 
        // 두번째 포인터가 끝까지 가면 첫번재 포인터 이동 & 두번째 포인터 초기화해 반복
        
        while(index1 < nums.length){
            //fix index1 value and  move index2 & compare
            //if it searched at the end of array , move index 1 and initialize index 2 
            if(index2 == nums.length) {
                index2 =0;
                ++index1; 
            }    
            
            
            if((nums[index1]+nums[index2] )== target){
                if(index1 != index2){  // dont' use the same index value twice. 
                    results[0]= index1;
                    results[1]= index2;   
                    return results;
                }
            }
            //move index 2
            index2 ++; 
        }
        
        return results;
    
    }
    
    
}