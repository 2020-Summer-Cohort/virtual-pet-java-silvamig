package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //create boolean value true/ false, define as true initially
        boolean running = true;

        VirtualPet bunnyBun = new VirtualPet(10, 10, 25);

        System.out.println("Your new pet Picasso the bun!");
        System.out.println("Hunger is " + bunnyBun.getHungerLevel());
        System.out.println("Thirstiness is " + bunnyBun.getThirstLevel());
        System.out.println("Happiness is " + bunnyBun.getHappinessLevel());

        while (running) {

            System.out.println("What would you like to do with Picasso?");
            System.out.println("Press 1 to Feed Picasso.");
            System.out.println("Press 2 to give Picasso a drink.");
            System.out.println("Press 3 to cuddle wittle Picasso.");
            System.out.println("Press 4 to do nothing.");
            System.out.println("Press 5 to EXIT and abandon Picasso.");
            String userInput = input.nextLine();

            if (userInput.equals("1")) {
                bunnyBun.feed(5);
                bunnyBun.tick();
            }
            if (userInput.equals("2")) {
                bunnyBun.drink(5);
                bunnyBun.tick();
            }
            if (userInput.equals("3")) {
                bunnyBun.cuddle(10);
                bunnyBun.tick();
            }
            if (userInput.equals("4")) {
                bunnyBun.tick();
            }
            if (userInput.equals("5")) {
                running = false;
            }
            if (bunnyBun.getHungerLevel() >= 50) {
                System.out.println("Picasso went to a friend's for dinner!");
                System.exit(0);
            }
            if (bunnyBun.getThirstLevel() >= 50) {
                System.out.println("Picasso went to the pub for a drink!");
                System.exit(0);
            }
            if (bunnyBun.getHappinessLevel() <= 10) {
                System.out.println("Picasso has moved on to bigger and better.");
                System.exit(0);
            }

            System.out.println("Picasso's hunger is " + bunnyBun.getHungerLevel());
            System.out.println("Picasso's thirstiness is " + bunnyBun.getThirstLevel());
            System.out.println("Picasso's hunger is " + bunnyBun.getHappinessLevel());
        }


    }
}




