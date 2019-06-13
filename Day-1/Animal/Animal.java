class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Cow");
        System.out.print(animal.getName());
        animal.walking();
    }
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void walking() {
        System.out.print("Walking");
    }
}