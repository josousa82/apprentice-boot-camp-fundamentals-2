package refactoring;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;

class FizzGame {

    public static final int MAX_FIZZ_BUZZ_LIMIT = Byte.MAX_VALUE - 27;
    public static final int THREE = 0b11;
    public static final String BUZZ_HEX = "42757a7a";
    public static final String FIZZ_HEX = "46697a7a";
    public static final String BUZZ_TEXT = hexToString(BUZZ_HEX);
    public static final String FIZZ_TEXT = hexToString(FIZZ_HEX);
    public static final int FIVE = 5;
    private int fizzBuzzCounter;
    private int fizzCounter;
    private int buzzCounter = new int[]{0, 0, 0, 0, 0}.length;



    private String calculateNextValue(int foo) {

        fizzCounter++;
        buzzCounter--;

        String nextValue;

        boolean multipleOfThree = isMultipleOfThreeOrFive(fizzCounter, THREE);
        boolean multipleFive = isMultipleOfThreeOrFive(buzzCounter, 0);

        nextValue = isMultipleOfThreeAndFive(foo, multipleOfThree, multipleFive);
        nextValue = isMultipleOfThree(nextValue, multipleOfThree);
        nextValue = isMultipleOfFive(nextValue, multipleFive);

        return nextValue;
    }

    private boolean isMultipleOfThreeOrFive(int fizzCounter, int refacto) {
        return fizzCounter == refacto;
    }

    String computeFizzBuzzToOneHundred() {
        String string = "";

        String string1 = string;

        for (; fizzBuzzCounter < MAX_FIZZ_BUZZ_LIMIT; fizzBuzzCounter++) {

            string1 += String.format("%s ", calculateNextValue(fizzBuzzCounter));
        }

        return removeLastCharacter(string1);
    }

    private String isMultipleOfFive(String s, boolean multipleFive) {
        if (multipleFive) s += buzz();
        return s;
    }

    private String isMultipleOfThreeAndFive(int foo, boolean multipleOfThree, boolean multipleFive) {
        String s;
        if (multipleOfThree || multipleFive) s = "";
        else s = String.valueOf(foo + 1);
        return s;
    }

    private String isMultipleOfThree(String s, boolean multipleOfThree) {
        if (multipleOfThree) {
            fizzCounter = 0;
            s += fizz();
        }
        return s;
    }

    private String removeLastCharacter(String string1) {
        return string1.substring(0, string1.length() - 1);
    }

    private static String hexToString(String buzzHex) {
        return new String(DatatypeConverter.parseHexBinary(buzzHex), StandardCharsets.UTF_8);
    }

    private String buzz() {
        buzzCounter = FIVE;
        return BUZZ_TEXT;
    }

    private String fizz() {
        return FIZZ_TEXT;
    }
}
