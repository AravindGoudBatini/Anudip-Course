package Lab_8;

class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle() {
    }
    

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void drive() {
        System.out.println("Driving the " + year + " " + brand + " " + model);
    }
}

class Car extends Vehicle {
    String color;

    Car(String brand, String model, int year, String color) {
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.color = color;
    }

    void honk() {
        System.out.println("The " + color + " " + brand + " " + model + " goes honk !");
    }
}

class InheritanceDemo{
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2021, "Red");
        myCar.drive();
        myCar.honk();
    }
}
