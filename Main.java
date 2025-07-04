import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        ArrayList<Other> enchantments = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter enchantment name, level, and price (type 'exit' to finish):");

        while (true) {
            String enchantment = scanner.next();
            if (enchantment.equalsIgnoreCase("exit")) break;


            int enchantmentLevel = scanner.nextInt();
            if (enchantmentLevel < 0) {
                enchantmentLevel = 0;
            }


            int price = scanner.nextInt();
            

            enchantments.add(new Other(enchantment, enchantmentLevel, price));

        }

        scanner.close();

        CalculateTotalPrice totalPriceCalculator = new CalculateTotalPrice(enchantments);
        int totalPrice = totalPriceCalculator.getTotalPrice();
        System.out.println("Total price of enchantments: " + totalPrice);

        for(int i = 10; i > 0; i--) {
            System.out.print("\rclosing in " + i + " seconds");
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {}
        }

    }
}