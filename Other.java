public class Other {

    String enchantmentName;
    int enchantmentLevel;
    int price;

    public Other(String enchantmentName,int enchantmentLevel, int price) {
        this.enchantmentName = enchantmentName;
        this.enchantmentLevel = enchantmentLevel;
        this.price = price;
    }

    public String getEnchantmentName() {
        return enchantmentName;
    }

    public int getEnchantmentLevel() {
        return enchantmentLevel;
    }

    public int getPrice() {
        return price;
    }
}