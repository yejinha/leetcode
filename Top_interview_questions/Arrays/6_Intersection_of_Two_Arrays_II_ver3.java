class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        //Runtime: 3 ms
        //Memory Usage: 43.5 MB

        //solution:  sort array first and use two pointers to compare

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int nums1Index = 0; 
        int nums2Index = 0;
        
        List<Integer> answerList = new ArrayList<>();
        
        
        while(nums1Index < nums1.length && nums2Index < nums2.length){
            if(nums1[nums1Index] == nums2[nums2Index]){  // if it has the same value, save and move forward both pointers 
                answerList.add(nums1[nums1Index]);
                ++nums1Index;
                ++nums2Index;
            }else if(nums1[nums1Index]>nums2[nums2Index]){  // if one array's value is greater that another, move pointer forward, because it is not worth to compare later values (since it is sorted) 
                ++nums2Index;
            }else if(nums1[nums1Index]<nums2[nums2Index]){
                ++nums1Index;
            }
        }
        
        int[] answer = new int[answerList.size()];
        
        //list to array
        for(int i=0; i<answer.length; i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
        
 }
}