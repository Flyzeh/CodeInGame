import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        int taille = MESSAGE.length();
        int total = 0;
        StringBuilder ascii = new StringBuilder();
        for (int i = 0; i < taille; i++) {
            total = (int) MESSAGE.charAt(i);
            String binary = Integer.toBinaryString(total);
            if (!Character.isLetter(MESSAGE.charAt(i)))
                ascii.append(0);
            ascii.append(binary);
        }
        String bits = "";
        int indice = 0;
        int j = 0;
        while(j < ascii.length()) {
            String nouveau = Character.toString(ascii.charAt(j));
            if (nouveau.equals("1")) {
                bits += "0 0";
                indice = j+1;
                if (indice < ascii.length()) {
                    while(indice < ascii.length() && Character.toString(ascii.charAt(indice)).equals("1")) {
                        bits += "0";
                        j++;
                        indice = j+1;
                    }
                }
                if (indice < ascii.length())
                    bits += " ";                
            }
            else {
                bits += "00 0";
                indice = j+1;
                if (indice < ascii.length()) {
                    while(indice < ascii.length() && Character.toString(ascii.charAt(indice)).equals("0")) {
                        bits += "0";
                        j++;
                        indice = j+1;
                    }
                }
                if (indice < ascii.length())
                    bits += " ";   
            }
            j++;
        }
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(bits);
    }
}
