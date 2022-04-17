class Solution {

    //rotate clockwise == transpose matrix then reverse rows
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    
    
    // transpose
    public void transpose(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            //switch values by diagonal direction
            // 대각선 방향으로 가면서 쭉 값 바꿈 (j=0 부터 시작하지 않는 이유)
            for(int j= i; j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    
    // reverse row value with two pointer
    // row 값 뒤집는함수 
    public void reverse(int[][] matrix){
        
        for(int k=0; k<matrix.length; k++){
            int endIndex =matrix.length-1; 
            int firstIndex =0;
            
            while(firstIndex < endIndex){
                int temp = matrix[k][firstIndex];
                matrix[k][firstIndex]= matrix[k][endIndex];
                matrix[k][endIndex]=temp;
                firstIndex++;
                endIndex--;
            }
        }
    }
    
}