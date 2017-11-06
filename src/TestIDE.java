
/*
*De va jag som skapade denna 2017-11-06.
*
 */


import javax.swing.*;

public class TestIDE {
    public static void main(String[] args) {

        /*variabler */
        int s;
        int randomNumber = (int) Math.floor(Math.random() * 100);
        boolean kontroll = false;
        int försök = 0;

        while (!kontroll) {
            försök = försök + 1;

            s = Integer.parseInt(JOptionPane.showInputDialog(null, "gissa på ett numer mellan 0 och 100"));

            /*
            kollar om ditt svar är rätt, samt brytter while loopen om ditt svar är rätt.
             */

            if (s > randomNumber) {
                JOptionPane.showMessageDialog(null, "För högt, testa igen");
            } else if (s < randomNumber) {
                JOptionPane.showMessageDialog(null, "Lite lågt, testa igen");
            } else if (s == randomNumber) {
                JOptionPane.showMessageDialog(null, "Rätt!" + " det tog " + försök + " försök");

                kontroll = true;
            }
        }
    }
}