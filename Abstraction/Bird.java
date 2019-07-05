public abstract class Bird extends Animal implements Canfly {
    public Bird(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(getName() + " picking grains..");
    }

    public void breathe() {
        System.out.println(getName() + " Breath in Breath out");
    }

    public void fly() {
        System.out.println(getName() + "flipping wings");
    }
}