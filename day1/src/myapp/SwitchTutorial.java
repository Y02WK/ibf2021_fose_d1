package myapp;

import java.io.Console;

public class SwitchTutorial {
    public static void main(String[] args) {
        Console cons = System.console();
        String input = cons.readLine("What is your hobby?\n");

        switch (input.trim().toLowerCase()) {
            case "swim":
                System.out.println("The nearest public swimming pool is in Clementi");
                break;
            case "jog":
                System.out.println("How fast can you jog a kilometer?");
                break;
            case "code":
                System.out.println("Cool!");
                break;
            default:
                System.out.printf("What is this %s hobby of yours?", input);
        }
    }
}
