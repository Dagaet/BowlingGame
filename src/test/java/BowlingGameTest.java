import org.testng.annotations.Test;

import java.util.Optional;

import static junit.framework.Assert.*;

public class BowlingGameTest {

    @Test
    public void shouldReturnScoreWhithAllStrikes() {
        BowlingGame bowlingGame = new BowlingGame();

        int score = bowlingGame.getScore("X|X|X|X|X|X|X|X|X|X||XX");

        assertEquals(300, score);
    }

    @Test
    public void shouldReturnScoreWhenAllSpare() {
        BowlingGame bowlingGame = new BowlingGame();

        int score = bowlingGame.getScore("5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5");

        assertEquals(150, score);
    }
}
