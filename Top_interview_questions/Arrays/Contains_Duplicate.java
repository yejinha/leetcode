class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 풀이법: 중복을 허용하지 않는 HashSet 의 특성을 사용해, 배열을 HashSet에 복사후 크기를 비교한다. 
        //using HashSet's charcteristic (unable to save duplicated values)
        HashSet<Integer> removeDuplicate = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            removeDuplicate.add(nums[i]);
        }
        
        // 둘이 크기가 다르다면 중복 값 있는것이기에 return true
        //if two objects have different size, it means the array has duplicated values. Return true. 
        if(removeDuplicate.size() != nums.length){
            return true;
        }
        
        return false; 
    }
}