package oop.lab.pkg6;

public class Food {

    private static double price = 50;
    private final static int energy = 10;

    public static int getEnergy(){
        return Food.energy;
    }
    public static double getPrice(){
        return Food.price;
    }
    public static void setPrice(double price){
        Food.price = price;
    }

}
