class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Runtime: 1 ms
        // Memory Usage: 42.5 MB
        

        //if length is 2, return itself
        // 길이 2면 바로 리턴한다. 
         if(nums.length == 2){  // O(1)
            return new int[]{0,1};
        }
        

        // map : use for saving  key:  target - nums ,  value: index 
        // 맵에 key : 목표값 - 지금값,  value: 인덱스 저장한다. 
        // 이미 지금 값으로 된 키가 있다면, 이전 값 + 지금값 = 목표값 만족시키는 경우 있다는 것. 
        Map targeted = new HashMap<Integer,Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(targeted.containsKey(nums[i])){   // if this number + one of previous number equal to target, return indexes. 
                return new int[]{(int)targeted.get(nums[i]), i};
            }
            
            int minus =target -nums[i]; // save map value. 
            targeted.put(minus,i);
        }        
        return results;
    
    }
    
    
}