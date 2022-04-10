class Solution {
    public List<Integer> list =new ArrayList<>();
    public List<Integer> resultList= new ArrayList<>();
    
    public int[] intersect(int[] nums1, int[] nums2) {
        
         if(nums1.length > nums2.length){
             resultList=dealWithNums(nums1, nums2);
         }else{
              resultList=dealWithNums(nums2, nums1);
         }
        
         int[] resultArray = new int[resultList.size()];
          
         for(int i=0; i<resultArray.length; i++){
             resultArray[i] =resultList.get(i);
         }
        
        return resultArray;
    }
    
    public List<Integer> dealWithNums(int[] listNums, int[] compareNums){
        for(int i:listNums){
            list.add(i);
        }
        
        for(int j=0; j<compareNums.length; j++){
            if(list.contains(compareNums[j])){
                resultList.add(compareNums[j]);
                list.remove(list.indexOf(compareNums[j]));
            }
        }
        
        return resultList;
    }
}