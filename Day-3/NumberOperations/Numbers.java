
class Numbers {
    int num;

    void Divisible() {
        for (num = 1; num <= 50; num++) {
            System.out.println(decideFizzBuzz(num));
        }
    }

    String decideFizzBuzz(int number) {
        if (num % 15 == 0) {
            return "Fizz Buzz";
        }
        if (num % 3 == 0) {
            return "Fizz";
        }
        if (num % 5 == 0) {
            return "Buzz";
        }
        return num;
    }
}