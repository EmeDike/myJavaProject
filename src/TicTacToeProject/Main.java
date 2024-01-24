//package TicTacToeProject;
//
//public class Main {
//    public static void main(String[] args) {
//        TicTacToe game = new TicTacToe();
//        HumanPlayer p1 = new HumanPlayer("Dike", 'X');
//        AIPlayer p2 = new AIPlayer("TAI", 'O');
//        Player cp;
//        cp = p1;
//
//        while (true) {
//            System.out.println(cp.name + "'s turn");
//            cp.makeMove(game);
//
//            game.displayBoard();
//
//            if (game.checkColumnWin() || game.checkRowWin() || game.checkDiagonalWin()) {
//                System.out.println(cp.name + " has won");
//                break;
//            } else if (game.isBoardFull()) {
//                System.out.println("It's a tie!");
//                break;
//            } else {
//                cp = (cp == p1) ? p2 : p1;
//            }
//        }
//    }
//}
