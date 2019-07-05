class CarPolymorphism {
    public static void main(String[] args) {
        Ford ford = new Ford(8, "Ford");
        System.out.println(ford.accelerate());
        System.out.println(ford.startEngine());
        System.out.println(ford.brake());
    }
}

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public String getName() {
        return this.name;
    }

    public String startEngine() {
        return "Car -> startEngine";
    }

    public String accelerate() {
        return "car -> accelerate";
    }

    public String brake() {
        return "car -> brake";
    }

}

class Ford extends Car {
    Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate";
    }

    public String brake() {
        return getClass().getSimpleName() + " -> brake";
    }
}