package csd402;
import java.util.Scanner;

public class module1 {
    public static void main(String[] args) {
        System.out.print("This program will calculate the energy needed (in joules) to change the initial\n" +
                "temperature of water to the designated final temperature in Celsius.\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        int water_mass = input.nextInt();

        System.out.print("Enter the initial temperature: ");
        int init_temperature = input.nextInt();

        System.out.print("Enter the final temperature: ");
        int final_temperature = input.nextInt();

        int Q = (water_mass * (final_temperature - init_temperature)) * 4184;

        System.out.println("The energy needed is: " + Q + " joules.");
    }
}
