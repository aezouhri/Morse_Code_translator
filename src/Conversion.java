/**
 * @author aezouhri
 */

/**
 * This class contains all the methods necessary for a morse to alphabet and alphabet to morse conversions.
 * @author aezouhri
 */
public class Conversion {
    /**
     * List of the Alphabet letters
     */
    final  static char alphabet_letters[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /**
     * List of the Alphabet character in Morse Code
     */
    final static String morse_code[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"};

    /**
     * This method is used to convert from regular letters to morse code.To do so,
     * it gets every character of the inputted string and matches it with it's morse equivalent in the morse_code string variable.
     * @param letter_input user input in regular letters.
     * @return A string containing the translated morse code.
     */
    public static String AlphabetToMorse(String letter_input) {

        String morse_translation = "";

        for (char c : letter_input.toCharArray()) {
            char temp = c;

            //used to make sure all letters are uppercase
            if (c >= 97 && c <= 122) {
                temp -= 32;
            }

            for (int i = 0; i < alphabet_letters.length; i++) {
                if (alphabet_letters[i] == temp) {
                    morse_translation += morse_code[i];
                }

            }

            morse_translation += "   "; //3 spaces between words in morse

        }


        return morse_translation;
    }


    /**
     * This method is used to convert from morse code to regular letters.To do so,
     * it gets every set og morse code from the inputted string and matches it with it's letter equivalent
     * in the alphabet_letters string variable.
     * @param morse_input user input in morse.
     * @return A string containing the translated letters.
     */
    public static String MorseToAlphabet(String morse_input) {
        String alphabet_translation = "";

        String morse_words[] = morse_input.split("\\s{3}");
        for (String word : morse_words) {
            String morse_letter[] = word.split("\\s");

            for (String letter : morse_letter) {
                for (int j = 0; j < morse_code.length; j++) {
                    if (letter.equals(morse_code[j])) {
                        alphabet_translation += alphabet_letters[j];
                    }

                }

            }


            alphabet_translation += " "; //space between word
        }


        return alphabet_translation;
    }


}
