import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 * This class is dedicated to framework.
 * @author aezouhri
 */
public class GUI extends JFrame {
    /**
     * Textfield that holds regular letters.
     */
    private JTextField alpha_to_morse;


    /**
     * Textfield that holds morse code.
     */
    private JTextField morse_to_alpha;


    /**
     * Different TextArea to display how the user is supposed to use the converter.
     */
    private JTextArea info1, info2, info3;


    /**
     * Constructor for the GUI, creates the different TextFields and TextArea. Sets their value and KeyListeners.
     */
    public GUI() {
        setLayout(new FlowLayout());

        alpha_to_morse = new JTextField(25);
        morse_to_alpha = new JTextField(25);
        info1 = new JTextArea(" Welcome to our Alphabet <=> Morse converter.");
        info2 = new JTextArea(" Window for alphabet input or translation.");
        info3 = new JTextArea(" Window for morse code input or translation.");


        add(info1);
        add(info2);
        add(alpha_to_morse);
        add(info3);
        add(morse_to_alpha);

        KeyHandler user_input = new KeyHandler();

        alpha_to_morse.addKeyListener(user_input);
        morse_to_alpha.addKeyListener(user_input);


        info1.setEditable(false);
        info2.setEditable(false);
        info3.setEditable(false);

    }


    /**
     * Handler class where we check when a key is pressed, released and typed.
     */
    private class KeyHandler implements KeyListener {

        @Override
        public void keyPressed(KeyEvent HitaKey) {

        }

        /**
         * Everytime a key is hit on the keyboard, if text is being typed in alpha_to_morse,
         * it will get the input in that TextField and convert it to morse and display the answer in morse_to_alpha.
         * Otherwise, if text is being typed in morse_to_alpha,
         * it will get the input in that TextField and convert it to morse and display the answer in alpha_to_morse.
         * @param ReleasedKey KeyEvent object
         */
        @Override
        public void keyReleased(KeyEvent ReleasedKey) {
            String morse_answer;
            String alphabet_answer;

            if (ReleasedKey.getSource() == alpha_to_morse) {
                morse_answer = Conversion.AlphabetToMorse(alpha_to_morse.getText());
                morse_to_alpha.setText(morse_answer);
            } else if (ReleasedKey.getSource() == morse_to_alpha) {
                alphabet_answer = Conversion.MorseToAlphabet(morse_to_alpha.getText());
                alpha_to_morse.setText(alphabet_answer);
            }
        }

        @Override
        public void keyTyped(KeyEvent typedKey) {

        }
    }
}


