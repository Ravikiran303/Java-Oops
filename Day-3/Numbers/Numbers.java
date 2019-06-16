class NumbersDemo {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.PrintNumbers();
        System.out.println("Sum of hundred numbers:" + numbers.sumOfHundredNumbers());
        numbers.divisibleByThreeAndFive();
    }
}

class Numbers {
    int num;

    void PrintNumbers() {
        for (num = 1; num <= 100; num++) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    int sumOfHundredNumbers() {
        int sum = 0;
        for (num = 1; num <= 100; num++) {
            sum = sum + num;
        }
        return sum;
    }

    void divisibleByThreeAndFive() {
        System.out.println("Divisible by 5 and 3 numbers:");
        for (num = 1; num <= 100; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num);
            }
        }

    }
}