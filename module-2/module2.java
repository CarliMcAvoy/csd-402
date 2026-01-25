package csd402;
import java.util.Scanner;

public class module2 {
    public static void main(String[] args) {
        System.out.println("\nHello! This is a 'Rock, Paper, Scissors' random generator! Please input a number below,\n" +
                "and the computer will randomly generate a number as well. The results will be shown afterwards!\n");
        System.out.println("\n1 = Rock\n" + "2 = Paper \n" + "3 = Scissors\n");

        int min = 1;
        int max = 3;

        int computer_choice = (int)(Math.random() * (max - min + 1)) + min;

        Scanner input = new Scanner(System.in);

        while(true){

            System.out.println("Please enter a number between " + min + " and " + max + ": ");
            int user_choice = input.nextInt();

            if (user_choice < min || user_choice > max) {
            System.out.println("\nInvalid choice.");
            }
            else {
            System.out.println("\nThe computer choice is " + computer_choice);
            System.out.println("Your choice is " + user_choice);
            }

            if (user_choice == computer_choice) {
                System.out.println("It's a draw!");
            }
                else if (user_choice == 1 && computer_choice == 2) {
                    System.out.println("Paper beats rock! You lost!");
            }
                else if (user_choice == 1 && computer_choice == 3) {
                    System.out.println("Rock beats scissors! You win!");
            }
                else if (user_choice == 2 && computer_choice == 1) {
                    System.out.println("Paper beats rock! You win!");
            }
                else if (user_choice == 2 && computer_choice == 3) {
                    System.out.println("Scissors beats paper! You lost!");
            }
                else if (user_choice == 3 && computer_choice == 1) {
                    System.out.println("Rock beats scissors! You lost!");
            }
                else if (user_choice == 3 && computer_choice == 2) {
                    System.out.println("Scissors beats paper! You win!");
            }

            System.out.println("Continue playing? ('y' or 'n'): ");
            char yes_or_no = input.next().charAt(0);

            switch (yes_or_no) {
                case 'y':
                    continue;
                case 'n':
                    System.out.println("Thanks for playing!");
                    System.exit(0);
            }

        }
    }
}
