/**
 * Created by lperez on 1/28/15.
 */
public class Mommify {

    private final String vowels = "aeiou";
    private final String replacementString = "mommy";

    public String replace(String inputString) {
        String outputString = "";
        char character[] = new char[inputString.length()];
        inputString.getChars(0, inputString.length(), character, 0);
        int numberOfVowels = calculateNumberOfVowels(inputString, character);

        if ((numberOfVowels * 100 / inputString.length()) > 30) {
            for (int i = 0; i < inputString.length(); i++) {
                if (vowels.contains(String.valueOf(character[i]))) {
                    if (i == 0 || !(vowels.contains(String.valueOf(character[i - 1])))) {
                        outputString += replacementString;
                    }
                } else {
                    outputString += character[i];
                }
            }
            return outputString;
        } else {
            return inputString;
        }
    }

    private int calculateNumberOfVowels(String inputString, char[] character) {
        int calculate = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (vowels.contains(new String(String.valueOf(character[i])))) {
                calculate++;
            }
        }
        return calculate;
    }

}
