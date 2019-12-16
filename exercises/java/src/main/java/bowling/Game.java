package bowling;



import java.util.Arrays;
import java.util.List;


public class Game {

    List<Frame> playScores;



    public int score(int[] rolls) {

        Integer[] newArray = Arrays.stream(rolls).boxed().toArray(Integer[]::new);

        Integer sum = 0;

        for (Integer a : newArray)  sum+=a;
        return sum;


    }



    public static void main(String[] args) {
        int[] test = { 5,5, 0,10, 1,1, 1,1, 1,1,
                1,1, 1,1, 1,9, 1,1, 1,1 };

        Game game = new Game();
        game.score(test);
    }


}
