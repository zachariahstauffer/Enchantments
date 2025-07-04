package JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        ArrayList<Enchantment> enchantments = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter enchantment name, level, emeralds, and number of books (type 'exit' to finish):");

        // Loop to read enchantments until 'exit' is entered
        while (true) {
            // reads the enchantment name, allowing for exit command
            String enchantment = scanner.next();
            if (enchantment.equalsIgnoreCase("exit")) break;

            // reads the enchantment level, ensuring it is non-negative
            int enchantmentLevel = scanner.nextInt();
            if (enchantmentLevel < 0) {
                enchantmentLevel = 0;
            }

            // reads the Emeralds and number of books, ensuring at least one book is considered
            int emeralds = scanner.nextInt();
            int numOfBooks = scanner.nextInt();
            if (numOfBooks < 1) {
                numOfBooks = 1;
            }
            
            //creates a new enchantment object with the given parameters
            enchantments.add(new Enchantment(enchantment, enchantmentLevel, emeralds, numOfBooks));

        }



        // Display the enchantments entered
        Calculations calculator = new Calculations();
        int totalemeralds = calculator.calculateTotalemeralds(enchantments);
        System.out.println("\nTotal emeralds needed: " + totalemeralds);


        // Creates a delay before proceeding
        try {
            Thread.sleep(500);
        } catch (Exception ignored) {}

        // Proceed with material calculations
        System.out.println("\nThis next part will calculate the materials neeeded to trade for the emeralds needed");

        try {
            Thread.sleep(1000);
        } catch (Exception ignored) {}

        // Prompt to continue with material calculations
        Scanner scanner2 = scanner;

        // Prompt the user to continue with material calculations
        System.out.println("Type y, yes, n, or no to continue");

        // reads the user's input to continue or exit
        String input = scanner2.next();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            System.out.println("Continuing...");
        } else {
            scanner2.close();
            return;
        }


        // Creates a delay before proceeding to material input
        try {
            Thread.sleep(500);
        } catch (Exception ignored) {}

        
        // Prompt the user for material input
        System.out.println("\nEnter material name, amount of materials, and number of emeralds given:");

        // reads the material name, allowing for exit command
        String materialName = scanner2.next();

        // reads the number of materials required, ensuring it is non-negative
        int numOfMaterial = scanner2.nextInt();
        if (numOfMaterial < 1) {
            numOfMaterial = 1;
        }

           // reads the number of emeralds given, ensuring it is non-negative
        int numOfEmeraldsGiven = scanner2.nextInt();
        if (numOfEmeraldsGiven < 0) {
            numOfEmeraldsGiven = 0;
        }

        // creates a new material object with the given parameters
        Material material = new Material(materialName, numOfMaterial, numOfEmeraldsGiven);
        

        scanner2.close();

        int[] totalMaterials = calculator.calculateTotalMaterials(
            material.getNumOfMaterial(), 
            material.getNumOfEmeraldsGiven(), 
            totalemeralds
        );

        // Display the materials needed
        System.out.println("\nThe number of " + material.getMaterialName() + " required is: " + 
            totalMaterials[0] + " stacks and " + totalMaterials[1] + " remaining items.");




        // Creates a delayed countdown before closing the program
        for(int i = 10; i > 0; i--) {
            System.out.print("\rclosing in " + i + " seconds");
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {}
        }

    }
}