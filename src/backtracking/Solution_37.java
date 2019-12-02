package backtracking;

/**
 * Leetcode 37
 * https://leetcode-cn.com/problems/sudoku-solver/
 */
public class Solution_37 {
    private char[][] board;

    private boolean isSolved = false;

    public void solveSudoku(char[][] board) {
        this.board = board;
        backtrack(0, 0);
    }

    private void backtrack(int row, int col) {
        if (this.board[row][col] == '.') {
            for (int num = 1; num < 10; num++) {
                char charNum = (char) (num + '0');
                if (canPut(charNum, row, col)) {
                    putNum(charNum, row, col);
                    putNextNum(row, col);
                    if (!isSolved) {
                        resetNum(row, col);
                    }
                }
            }
        } else {
            putNextNum(row, col);
        }
    }

    private void resetNum(int row, int col) {
        this.board[row][col] = '.';
    }

    private void putNextNum(int row, int col) {
        if (row == 8 && col == 8) {
            isSolved = true;
        } else {
            if (col == 8) {
                backtrack(row + 1, 0);
            } else {
                backtrack(row, col + 1);
            }
        }
    }

    private void putNum(char num, int row, int col) {
        this.board[row][col] = num;
    }

    private boolean canPut(char num, int row, int col) {
        return this.board[row][col] == '.' && canPut2Row(num, row) && canPut2Col(num, col) &&
                camPut2Cell(num, row, col);
    }

    private boolean canPut2Row(char num, int row) {
        for (int col = 0; col < 9; col++) {
            if (this.board[row][col] == num) {
                return false;
            }
        }
        return true;
    }

    private boolean canPut2Col(char num, int col) {
        for (int row = 0; row < 9; row++) {
            if (this.board[row][col] == num) {
                return false;
            }
        }
        return true;
    }

    private boolean camPut2Cell(char num, int row, int col) {
        int cellRow = row / 3;
        int cellCol = col / 3;
        for (int i = cellRow * 3; i < cellRow * 3 + 3; i++) {
            for (int j = cellCol * 3; j < cellCol * 3 + 3; j++) {
                if (this.board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
