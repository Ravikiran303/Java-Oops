class Person {
    public static void main(String[] args) {
        Details name_assign = new Details();
        name_assign.setName("Ravi");
        System.out.println(name_assign.getName());
    }
}

class Details {
    String Person_Name;

    void setName(String name) {
        Person_Name = name;
    }

    String getName() {
        return Person_Name;
    }
}