public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    public void fly() {
        super.fly();
        System.out.println(getName() + "flying branch to branch");
    }
}