package testing;

import java.io.Console;
import java.util.Scanner;

public class inputTest {
    public static void main(String[] args) {
        Console cons = System.console();
        String cmd = cons.readLine("Say hello\n").replaceAll(",", "");
        // System.out.printf("What did you say? %s\n", hello);

        Scanner scan = new Scanner(cmd);
        System.out.println("Input something?");
        while (scan.hasNext()) {
            String arg = scan.next();
            System.out.printf("%s\n", arg);
        }
        scan.close();
    }
}
