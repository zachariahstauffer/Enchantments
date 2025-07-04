import java.util.ArrayList;

public class CalculateTotalPrice {
    ArrayList<Other> enchantments;

    public CalculateTotalPrice(ArrayList<Other> enchantments) {
        this.enchantments = enchantments;
    }

    private int calculateTotalPrice(){
        int totalPrice = 0;
        for (int i = 0; i < enchantments.size(); i++) {
            int price = enchantments.get(i).getPrice();
            totalPrice += price;
        }
        return totalPrice;

    }

    public int getTotalPrice() {
        return calculateTotalPrice();
    }
}