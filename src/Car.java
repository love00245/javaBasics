public class Car {
    int fuelInLiters = 10;
    String color;
    String model;
    String engine;
    String name;
    boolean hasFuel;

    public static void startCar(){

    }

    public int getFuelInLiters() {
        return fuelInLiters;
    }
    public String getCarColor() {
        return color;
    }

    public void reFuel(){
        fuelInLiters+=5;
    }

}
