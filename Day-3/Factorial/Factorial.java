class FactorialDemo {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.ProductOfoneTon(5);
    }
}

class Factorial {
    int num;
    int fact = 1;

    void ProductOfoneTon(int value) {
        for (num = 1; num <= value; num++) {
            fact = fact * num;
        }
        System.out.println(fact);
    }
}