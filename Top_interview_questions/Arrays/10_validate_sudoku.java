class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        //solution :  invalidate sudoku cases
        // 1) duplication in each 3X3 matrix
        // 2) duplication in row
        // 3) duplication in column
        
        // 3X3 매트릭스 먼저 체크
        //compare 3X3 matrix first 
        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
               if(!checkMatrix(board, i,j)){
                   return false; 
               }
            }
        }
        
        //compare row and col 
        // 각 숫자의 행, 열 체크
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(!checkCol(board, i,j)){
                    return false;
                }
                 if(!checkRow(board, i,j)){
                    return false;
                }
            }
        }
        
        return true;
        
    }
    
    
    //compare 3 by 3 matrix 
    // input left corner of the matrix
    // 각 매트릭스의 좌상단점 넣어서 매트릭스 내 중복 검사
    public boolean checkMatrix(char[][] board,int x, int y){
        Set checkDuplicate = new HashSet();
        for(int i=x; i<x+3; i++){
            for(int j=y; j<y+3; j++){
                if(board[i][j]!='.'){
                    if(!checkDuplicate.add(board[i][j])){
                        return false; 
                    };
                }
            }
        }
        return true; 
    }
    
    
    // check its row
    // you just have to check the latter number of its row.
    // the former numbers are already checked. 
    // 행 검사.  열번호는 고정하고 해당 행번호 뒤로만 검사하면됨. 앞의 숫자들은  이미 뒤랑 안 겹친다고 체크 완료 
    public boolean checkRow(char[][] board, int x, int y){
        Set checkDuplicate = new HashSet();
        for(int i=x; i<9; i++){
                if(board[i][y]!='.'){
                    if(!checkDuplicate.add(board[i][y])){
                        return false; 
                    };
                }   
        }
        return true;
    }
    
    public boolean checkCol(char[][] board, int x, int y){
        Set checkDuplicate = new HashSet();
        for(int i=y; i<9; i++){
             if(board[x][i]!='.'){
                    if(!checkDuplicate.add(board[x][i])){
                        return false; 
                    };
            }
        }
        return true;
    }
    
    
}