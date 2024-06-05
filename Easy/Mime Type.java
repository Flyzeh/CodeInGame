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
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        String[] extension = new String[N];
        String[] mime = new String[N];
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            extension[i] = EXT.toUpperCase();
            mime[i] = MT;
        }

        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.

            String[] terminaison = FNAME.toUpperCase().split("\\.", 3);

            if (terminaison.length < 2)
                System.out.println("UNKNOWN");
            else {
                boolean trouver = false;
                for(int j = 0; j < N; j++) {
                    if (terminaison[terminaison.length-1].equals(extension[j])) {
                        System.out.println(mime[j]);
                        trouver = true;
                    }
                }
                if (trouver == false)
                    System.out.println("UNKNOWN");
                }
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");


        // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
    }
