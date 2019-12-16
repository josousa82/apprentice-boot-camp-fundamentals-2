package bowling;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BowlingTest {


    @Test
    public void zeroScore() {

        int[] rolls = { 0,0, 0,0, 0,0, 0,0, 0,0, 0,0,
                        0,0, 0,0, 0,0, 0,0, 0,0 };

        Game game = new Game();

        assertThat(game.score(rolls)).as("For a zero score should return 0.").isEqualTo(0);
    }

    @Test
    public void oneScore(){

        int[] rolls = { 1,1, 1,1, 1,1, 1,1, 1,1,
                        1,1, 1,1, 1,1, 1,1, 1,1 };

        Game game = new Game();

        assertThat(game.score(rolls)).
                as("For roll in each frame should return total of rolls").isEqualTo(20);
    }

    @Test
    public void OneSparePerFrameScore(){

        int[] rolls = {0,10, 4,6, 5,5, 0,0, 0,0,
                        0,0, 0,0, 0,0, 0,0, 0,0};

        Game game = new Game();

        assertThat(game.score(rolls))
                .as("For each frame, has one roll with 0 " +
                "pins and one with a full pins knocked down, making a spare, with 10 points per frame and total 100 game")
                .isEqualTo(39);
    }

    @Test
    public void strikeTest(){

    }
}
