
public class Car {

    String brand;
    String model;
    String engine;
    int power;
    int price;
    String doors;
    String seats;
    String color;

    public Car(String brand, String model, String engine, int power, int price, String doors, String seats, String color) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.power = power;
        this.price = price;
        this.doors = doors;
        this.seats = seats;
        this.color = color;
    }

    @Override
    public String toString(){

        String str;
        str = "brand: " + brand + "\n";
        str = "model: " + model + "\n";
        str = "engine: " + engine + "\n";
        str = "power: " + power + "\n";
        str = "price: " + price + "\n";
        str = "doors: " + seats + "\n";
        str = "seats: " + seats + "\n";
        str = "color: " + color + "\n";

        return str;
    }
}
