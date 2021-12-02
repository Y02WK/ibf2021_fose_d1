package myapp;

import java.io.Console;

public class IfTutorial {
    public static void main(String[] args) {
        Console cons = System.console();

        String input = cons.readLine("What is your hobby?\n").trim();

        if (input.equalsIgnoreCase("swim")) {
            System.out.println("The nearest public swimming pool is in Clementi");
        }
        else if (input.equalsIgnoreCase("jog")) {
            System.out.println("How fast can you jog a kilometer?");
        }
        else if(input.equalsIgnoreCase("code")) 
            System.out.println("Cool!");
        else
            System.out.printf("What is this %s hobby of yours?", input);
    }
}
