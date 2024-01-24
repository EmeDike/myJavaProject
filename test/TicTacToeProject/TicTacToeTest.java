package TicTacToeProject;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    private TicTacToe game;

    @Before
    public void setUp() {
        game = new TicTacToe();
    }

    @Test
    public void testPlaceMarkInValidPosition() {
        game.placeMark(1, 1, 'X');
        assertEquals('X', game.board[1][1]);
    }

    @Test
    public void testPlaceMarkInInvalidPosition() {
        game.placeMark(3, 3, 'O');
        assertEquals(' ', game.board[2][2]); // Correcting index to 2,2
    }

    @Test
    public void testCheckRowWin() {
        game.placeMark(0, 0, 'X');
        game.placeMark(0, 1, 'X');
        game.placeMark(0, 2, 'X');
        assertTrue(game.checkRowWin());
    }

    @Test
    public void testCheckColumnWin() {
        game.placeMark(0, 0, 'O');
        game.placeMark(1, 0, 'O');
        game.placeMark(2, 0, 'O');
        assertTrue(game.checkColumnWin());
    }

    @Test
    public void testCheckDiagonalWin() {
        game.placeMark(0, 0, 'X');
        game.placeMark(1, 1, 'X');
        game.placeMark(2, 2, 'X');
        assertTrue(game.checkDiagonalWin());
    }

    @Test
    public void testCheckAntiDiagonalWin() {
        game.placeMark(0, 2, 'O');
        game.placeMark(1, 1, 'O');
        game.placeMark(2, 0, 'O');
        assertTrue(game.checkDiagonalWin()); // Correcting method name
    }

    @Test
    public void testIsBoardFull() {
        assertFalse(game.isBoardFull());
        fillBoard();
        assertTrue(game.isBoardFull());
    }

    @Test
    public void testGameNotOver() {
        assertFalse(game.isGameOver());
    }

    @Test
    public void testGameDraw() {
        fillBoard();
        assertTrue(game.isGameOver());
        assertFalse(game.checkRowWin() || game.checkColumnWin() || game.checkDiagonalWin());
    }

    @Test
    public void testGameWin() {
        game.placeMark(0, 0, 'X');
        game.placeMark(0, 1, 'X');
        game.placeMark(0, 2, 'X');
        assertTrue(game.isGameOver());
        assertTrue(game.checkRowWin());
    }

    private void fillBoard() {
        game.placeMark(0, 0, 'X');
        game.placeMark(0, 1, 'O');
        game.placeMark(0, 2, 'X');
        game.placeMark(1, 0, 'O');
        game.placeMark(1, 1, 'X');
        game.placeMark(1, 2, 'O');
        game.placeMark(2, 0, 'X');
        game.placeMark(2, 1, 'O');
        game.placeMark(2, 2, 'X');
    }
}
