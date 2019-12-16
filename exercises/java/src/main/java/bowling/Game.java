package bowling;



import java.util.Arrays;
import java.util.List;


public class Game {

    List<Frame> playScores;



    public int score(int[] rolls) {

        Integer[] newArray = Arrays.stream(rolls).boxed().toArray(Integer[]::new);

        Integer sum = 0;

        ///for (Integer a : newArray)  sum+=a;

        for (int i = 1; i < newArray.length; i+=2) {

            if(newArray[i] + newArray[i-1] == 10){
                sum += newArray[i] + newArray[(i-1)] + newArray[i+1];
            }else{
                sum += newArray[i] + newArray[i-1];
            }
        }
        return sum;
    }



}
