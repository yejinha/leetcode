class Solution {
    public int removeDuplicates(int[] nums) {
        // 풀이법 : 오름차순 정렬되어있기에 앞에서부터 비교하면서 중복 값 제거하고 새로운 값 만나면 비교 기준값 교체해간다
        // solution : Since the array is fully ordered, compare from first value and change refenrence value when I find different value. 

        //answer variable  리턴 값 
        int numberOfRemains = nums.length; 
        // use list for saving array after removing duplicates. 
        // 배열은 크기를 수정할 수 없기에 가변 크기가 가능한 List 사용 
        List<Integer>list= new ArrayList<>();
        
        //compare from the first number of array with others. (reference number = nums[0])
        // 인덱스 0부터  차례로 비교함. 
        int num = nums[0];
        for(int i =1; i<nums.length; i++){
            if(num == nums[i]){ //if two nums are the same, it is duplicated. It should be removed.  비교값과 같으면 제거해야함. 즉 남은 숫자 줄어들음. 
                --numberOfRemains;
            }else{ //if two nums are different each other, it is not duplicated. Change reference number to next different number.  
                   // 두 숫자가 다르면 결과 리스트에 저장하고 기준값을 새로운 숫자로 바꾼다. 
                list.add(num);
                num=nums[i];
            }
        }
        
        //마지막 기준값은 다음 기준값 없어서 저장되지 못함. for 문 밖에서 한번 다시 저장한다. 
        // last reference number cannot be saved. So I have to save outside of For-loop
        list.add(num);
        
        //change nums array's first K values. 
        // 원래 array 를  중복 제거한 값으로 바꿔준다. 중복 제거한 값 만큼만 바꾸고 그 뒤는 무시 
        for(int i=0; i<list.size(); i++){
            nums[i]=list.get(i);
        }
        
        return numberOfRemains; 
        
    }
}
