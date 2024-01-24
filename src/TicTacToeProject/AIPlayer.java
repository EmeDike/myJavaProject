//package TicTacToeProject;
//
//import java.util.Random;
//
//public class AIPlayer extends Player {
//
//
//    public AIPlayer(String name, char mark) {
//        this.name = name;
//        this.mark = mark;
//    }
//
//    public void makeMove(TicTacToe game) {
//        int row;
//        int col;
//        Random random = new Random();
//
//        do {
//            row = random.nextInt(3);
//            col = random.nextInt(3);
//        } while (!isValidMove(game, row, col));
//
//        game.placeMark(row, col, mark);
//    }
//
//
//}
