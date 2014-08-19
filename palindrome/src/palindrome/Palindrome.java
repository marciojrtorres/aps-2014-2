package palindrome;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import org.apache.commons.lang3.StringUtils;

public class Palindrome {

    public static void main(String[] args) {
        String palavra = showInputDialog(null, "Digite uma palavra:");

        if (ehPalindrome(palavra)) {
            showMessageDialog(null, "EH PALINDROME");
        } else {
            showMessageDialog(null, "NAO EH PALINDROME");
        }
    }

    public static boolean ehPalindrome(String palavra) {
        return StringUtils.equals(palavra, StringUtils.reverse(palavra));
    }

}