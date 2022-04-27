package datastruct.stack.reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String input = null, output;
        while (true){
            System.out.println("");
            System.out.flush();
            input = getString();
            if (input.equals(" ")) break;
            Reverser theReveser = new Reverser(input);
            output = theReveser.doRev();
            System.out.println("Reversed: "+ output);
        }
    }
    public static String getString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String s = br.readLine();
        return s;
    }
}
