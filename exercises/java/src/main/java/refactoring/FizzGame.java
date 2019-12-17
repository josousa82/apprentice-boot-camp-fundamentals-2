package refactoring;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;

class FizzGame {

    public static final int MAX_FIZZ_BUZZ_LIMIT = Byte.MAX_VALUE - 27;
    public static final int THREE = 0b11;
    public static final String BUZZ_HEX = "42757a7a";
    public static final String FIZZ_HEX = "46697a7a";
    public static final String BUZZ_TEXT = new String(DatatypeConverter.parseHexBinary(BUZZ_HEX), StandardCharsets.UTF_8);
    public static final String FIZZ_TEXT = new String(DatatypeConverter.parseHexBinary(FIZZ_HEX), StandardCharsets.UTF_8);
    public static final int FIVE = 5;

    private int fizzBuzzCounter;
    private int fizzCounter;
    private int buzzCounter = new int[]{0, 0, 0, 0, 0}.length;


    private String calculateNextValue(int foo) {

        fizzCounter++;
        buzzCounter--;

        String s;

        boolean multipleOfThree = (fizzCounter == THREE);
        boolean multipleFive = (buzzCounter == 0);

        if (multipleOfThree || multipleFive) {
            s = "";
        } else {

            s = String.valueOf(foo + 1);
        }

        if (multipleOfThree) {
            fizzCounter = 0;
            s += fizz();
        }
        if (multipleFive) s += buzz();
        return s;
    }

    String computeFizzBuzzToOneHundred() {
        String string = "";

        String string1 = string;

        for (; fizzBuzzCounter < MAX_FIZZ_BUZZ_LIMIT; fizzBuzzCounter++) {

            string1 = string1 + String.format("%s ", calculateNextValue(fizzBuzzCounter));
        }
        String trimmedString = string1.substring(0, string1.length() - 1);

        return trimmedString;
    }



    private String buzz() {
        buzzCounter = FIVE;
        return BUZZ_TEXT;
    }

    private String fizz() {
        return FIZZ_TEXT;
    }
}
