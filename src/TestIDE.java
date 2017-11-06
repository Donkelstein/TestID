
/*
*De va jag som skapade denna 2017-11-06.
*
 */


import javax.swing.*;

public class TestIDE {
    public static void main(String[] args) {

        int s;
        int randomNumber = (int) Math.floor(Math.random() * 100);
        boolean kontroll = false;

        while (!kontroll) {


            s = Integer.parseInt(JOptionPane.showInputDialog(null, "gissa på ett numer mellan 0 och 100"));

            if (s > randomNumber) {
                JOptionPane.showMessageDialog(null, "för högt, testa igen");
            } else if (s < randomNumber) {
                JOptionPane.showMessageDialog(null, "lite lågt, testa igen");
            } else if (s == randomNumber) {
                JOptionPane.showMessageDialog(null, "rätt");
                kontroll = true;
            }
        }
    }
}