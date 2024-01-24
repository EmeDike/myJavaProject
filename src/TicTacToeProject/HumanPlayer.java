//package TicTacToeProject;
//
//import java.util.Scanner;
//
//public class HumanPlayer extends Player {
//    public HumanPlayer(String name, char mark) {
//        this.name = name;
//        this.mark = mark;
//    }
//
//    public void makeMove(TicTacToe game) {
//        Scanner scanner = new Scanner(System.in);
//
//        int row;
//        int col;
//
//        do {
//            System.out.println("Player " + mark + ", enter your move (row and column): ");
//            row = scanner.nextInt();
//            col = scanner.nextInt();
//        } while (!isValidMove(game, row, col));
//
//        game.placeMark(row, col, mark);
//    }
//}
