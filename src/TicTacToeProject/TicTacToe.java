//package TicTacToeProject;
//
//public class TicTacToe {
//    static char[][] board;
//
//    public TicTacToe() {
//        board = new char[3][3];
//        initBoard();
//    }
//
//    private void initBoard() {
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                board[i][j] = ' ';
//            }
//        }
//    }
//
//    public void displayBoard() {
//        System.out.println("---------------");
//        for (int i = 0; i < board.length; i++) {
//            System.out.print(" | ");
//            for (int j = 0; j < board[i].length; j++) {
//                System.out.print(board[i][j] + " | ");
//            }
//            System.out.println();
//            System.out.println("---------------");
//        }
//    }
//
//    public void placeMark(int row, int col, char mark) {
//        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
//            board[row][col] = mark;
//        } else {
//            System.out.println("Invalid Position");
//        }
//    }
//
//    public boolean checkRowWin() {
//        for (int i = 0; i <= 2; i++) {
//            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean checkColumnWin() {
//        for (int j = 0; j <= 2; j++) {
//            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean checkDiagonalWin() {
//        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') ||
//                (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')) {
//            return true;
//        }
//        return false;
//    }
//
//    public boolean isBoardFull() {
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                if (board[i][j] == ' ') {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    public boolean isGameOver() {
//        return checkRowWin() || checkColumnWin() || checkDiagonalWin() || isBoardFull();
//    }
//
//    public boolean isCellOccupied(int row, int col, char mark) {
//        // Check if the specified cell is within the bounds of the board
//        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
//            // Check if the cell is already occupied by the specified mark
//            return board[row][col] == mark;
//        } else {
//            // Handle the case where the cell is outside the bounds of the board
//            System.out.println("Invalid cell position");
//            return false;
//        }
//    }
//    public boolean isCellOccupied(char mark) {
//        for (int row = 0; row < 3; row++) {
//            for (int col = 0; col < 3; col++) {
//                if (board[row][col] == mark) {
//                    // Cell is already occupied by the specified mark
//                    return true;
//                }
//            }
//        }
//        // No cell is occupied by the specified mark
//        return false;
//    }
//
//}
