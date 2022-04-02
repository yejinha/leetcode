class Solution {
    public void rotate(int[] nums, int k) {
        // 풀이법: 배열 크기보다 회전 수가 많다면  배열 크기보다 같거나 작도록 수정한다. (한 바퀴 돌아서 반영되지 않기에)
        // 회전된 배열에서 인덱스가 원래 배열에서 어떤 인덱스인지 역으로 계산한다. 
   
       // if added index is larger than array's size, adjust it to fit it. 
       // example, [0,1,2,3,4], k=3 -> [2,3,4,0,1]  2's index : 2->5 (rotate k times)-> 5-5(array's length) =0 
       
        int[] rotated = new int[nums.length];
        
        //if K is larger than array's length, make it smaller or equal to array's length
        if(nums.length < k){
            while(nums.length <k){
                k -= nums.length; 
            }
        }

        // rotated index -> find original index 
        // 회전 후 인덱스 =  원래 인덱스 + 회전수 / (원래 인덱스 +회전수가 배열 크기보다 크다면) 원래 인덱스 + 회전수  - 배열 길이 
        // 역산하여 회전 후 배열에 들어갈 값의 원래 배열의 인덱스를 알아낸다. 

        int  index =0;
        for(int i=0; i<nums.length; i++){
            index=  (i-k) <0 ? i-k+nums.length : i-k;
            rotated[i] = nums[index];
        }

        // copy rotated array to original array 
        // 원래 배열을 재정렬 해야하기에 회전 후 값 저장한 배열을 복사한다. 
        for(int i=0; i<nums.length; i++){
            nums[i] = rotated[i];
        }
    }
}