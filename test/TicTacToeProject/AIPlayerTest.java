package TicTacToeProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class AIPlayerTest {

        @Test
        public void testAIMakesMoveOnEmptyBoard() {
            TicTacToe game = new TicTacToe();
            AIPlayer aiPlayer = new AIPlayer("TAI", 'O');

            aiPlayer.makeMove(game);
            assertTrue(game.isCellOccupied(aiPlayer.mark));
        }

        @Test
        public void testAIMakesMoveAfterPlayerMoves() {
            TicTacToe game = new TicTacToe();
            AIPlayer aiPlayer = new AIPlayer("AI", 'O');
            game.placeMark(1, 1, 'X');
            aiPlayer.makeMove(game);

            assertTrue(game.isCellOccupied(aiPlayer.mark));
        }

        @Test
        public void testAIMakesMoveAfterPlayerFillsBoard() {
            TicTacToe game = new TicTacToe();
            AIPlayer aiPlayer = new AIPlayer("AI", 'O');

            // Fill the board with player moves
            game.placeMark(0, 0, 'X');
            game.placeMark(0, 1, 'O');
            game.placeMark(0, 2, 'X');
            game.placeMark(1, 0, 'O');
            game.placeMark(1, 1, 'X');
            game.placeMark(1, 2, 'O');
            game.placeMark(2, 0, 'X');
            game.placeMark(2, 1, 'O');
            game.placeMark(2, 2, 'X');

            // AI makes a move after the board is filled by the player
            aiPlayer.makeMove(game);

            // Ensure AI did not make a move (board remains full)
            assertFalse(game.isCellOccupied(aiPlayer.mark));
        }

        @Test
        public void testAIMakesMoveAfterAIWins() {
            TicTacToe game = new TicTacToe();
            AIPlayer aiPlayer = new AIPlayer("AI", 'O');

            // Set up a winning scenario for the AI
            game.placeMark(0, 0, 'O');
            game.placeMark(1, 1, 'O');
            game.placeMark(2, 2, 'O');

            aiPlayer.makeMove(game);
            assertFalse(game.isCellOccupied(aiPlayer.mark));
        }
}