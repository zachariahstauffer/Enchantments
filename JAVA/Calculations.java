package JAVA;
import java.util.ArrayList;

public class Calculations {

    public int calculateTotalemeralds(ArrayList<Enchantment> enchantments)     {
        int totalemeralds = 0;
        for (int i = 0; i < enchantments.size(); i++) {
            int emeralds = enchantments.get(i).getEmeralds();
            int books = enchantments.get(i).getNumOfBooks();
            totalemeralds += (emeralds * books);
        }
        
        return totalemeralds;

    }

    public int[] calculateTotalMaterials(int numOfMaterial, int numOfEmeraldsGiven, int totalemeralds) {

        int total = 0;

        // Calculate the total materials required based on the number of materials and emeralds given

        total = numOfMaterial * (totalemeralds / numOfEmeraldsGiven);

        int stacks = total / 64; // Convert to number of stacks (assuming 64 items per stack)
        int remaining = total % 64; // Remaining items after full stacks

        return new int[]{stacks, remaining};
    }
}