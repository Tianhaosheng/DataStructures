package leetcode;

import java.time.chrono.IsoChronology;

public class T36 {
    public static void main(String[] args) {
        char[][] chars = {
                {'9','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(chars));
    }

    public static boolean isValidSudoku(char[][] board) {

        for(int i = 0;i < 9;i++){
            for(int j = 0;j < 9;j++){
                if(board[i][j] =='.') continue;
                for(int k = j + 1; k < 9;k++){
                    if(board[i][k] == board[i][j]) return false;
                }
                for(int k = i + 1; k < 9;k++){
                    if(board[k][j] == board[i][j]) return false;
                }
                for(int k = i + 1; k % 3 != 0; k ++){
                    for(int h = j / 3 * 3;h < j / 3 * 3  + 3; h ++ )
                        if(board[i][j] == board[k][h])
                            return false;
                }

            }
        }
        return true;
    }
}
