class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       //Runtime: 6 ms
      //Memory Usage: 44.7 MB
       
        Map<Integer, Integer> saved = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        
        // save nums1 into a hashmap
        // key : nums1's value  value : value's frequency
        // nums1 을 해시맵에 넣는다.  키: 배열 값, 값: 배열값 중복 횟수 
        for(int i=0; i<nums1.length; i++){
            if(saved.containsKey(nums1[i])){
                saved.put(nums1[i],saved.get(nums1[i])+1);
            }else{
                saved.put(nums1[i],1);
            }
        }
        
        // nums2 를 하나씩 비교하면서 nums1 에 있으면 정답 리스트에 넣는다.
        // 이때 중복 값 체크 때문에 nums1 넣은 맵의 값을 하나씩 줄인다. 
        // search nums2 value in nums1's hashmap.
        // if it contains nums2 value and it is not checked before, put it in answer list. 
        for(int j=0; j<nums2.length; j++){
            if(saved.containsKey(nums2[j])){
                if(saved.get(nums2[j])>0){
                    answer.add(nums2[j]);
                    saved.put(nums2[j], saved.get(nums2[j])-1);
                }
            }
        }
        
        //answer list to array
        int[] anwerArray = new int[answer.size()];
        for(int k=0; k<anwerArray.length; k++){
            anwerArray[k]=answer.get(k);
        }
        
        return anwerArray;
    }
    

}