import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


/**
 * This class generates a window and runs the GUI and Conversion class.
 * @author aezouhri
 */
public class Main {
    /**
     * Runs the GUI application
     * @param args Java command
     */
    public static void main(String[] args) {

        GUI MorseToAlphabet = new GUI();
        MorseToAlphabet.setSize(400, 500);
        MorseToAlphabet.setVisible(true);
        MorseToAlphabet.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


}
