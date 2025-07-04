package JAVA;
public class Material {

    // Properties of the material
    String materialName; // Name of the material
    int numOfMaterialRequired; // Number of materials required
    int numOfEmeraldsGiven; // Number of emeralds given for the material

    // Constructor to initialize the material with its name, number of materials required, and number of emeralds given
    public Material(String materialName, int numOfMaterial, int numOfEmeraldsGiven) {
        this.materialName = materialName;
        this.numOfMaterialRequired = numOfMaterial;
        this.numOfEmeraldsGiven = numOfEmeraldsGiven;
    }

    // Getters to retrieve the material's properties
    public String getMaterialName() {
        return materialName;
    }

    // Getters to retrieve the number of materials required
    public int getNumOfMaterial() {
        return numOfMaterialRequired;
    }

    // Getters to retrieve the number of emeralds given
    public int getNumOfEmeraldsGiven() {
        return numOfEmeraldsGiven;
    }


}