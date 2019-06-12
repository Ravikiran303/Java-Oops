class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ravi");
        System.out.println(person.getName());
    }
}

class Person {
    String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}