class AbstractionDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Max");
        dog.breathe();
        dog.eat();
        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
    }
}