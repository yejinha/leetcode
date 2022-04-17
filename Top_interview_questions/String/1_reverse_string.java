class Solution {
    public void reverseString(char[] s) {
        //mapping current & changed index:  if current index = 0 -> changed index = s.lenght-1
        // increase current index and decrease changed index;
        // loop until changed index is larger than current index (bc. if indexes are the same, you doesen't have to switch it)
        // 현재 인덱스와 교환해야할 인덱스 짝지어 넣는다. 
        // 현재 인덱스는 증가, 교환할 인덱스는 감소 시켜서 둘이 만날때까지 루프 돌린다. 
        int current = 0;
        int changed = s.length-1; 
        
        //
        char temp = '.';
        
        while(current < changed){
            temp = s[changed];
            s[changed] = s[current];
            s[current] = temp;
            ++current; 
            --changed;
        }
        
    }
}