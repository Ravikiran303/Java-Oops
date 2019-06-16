class NumberOperations {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.Divisible();
    }
}

class Numbers {
    int num;

    void Divisible() {
        for (num = 1; num <= 50; num++) {
            if (num % 3 == 0) {
                System.out.println("Fizz");
            }
            if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }
    }
}