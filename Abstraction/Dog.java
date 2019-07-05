class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(getName() + " eating..");
    }

    public void breathe() {
        System.out.println(getName() + " Breath in Breath out");
    }
}