package JAVA;
public class Enchantment {

    String enchantmentName;
    int enchantmentLevel;
    int emeralds;
    int numOfBooks;

    public Enchantment(String enchantmentName,int enchantmentLevel, int emeralds, int numOfBooks) {
        this.enchantmentName = enchantmentName;
        this.enchantmentLevel = enchantmentLevel;
        this.emeralds = emeralds;
        this.numOfBooks = numOfBooks;
    }

    public String getEnchantmentName() {
        return enchantmentName;
    }

    public int getEnchantmentLevel() {
        return enchantmentLevel;
    }

    public int getEmeralds() {
        return emeralds;
    }

    public int getNumOfBooks() {
        return numOfBooks;
    }
}