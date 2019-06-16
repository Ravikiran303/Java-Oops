class NumbersDemo {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.PrintNumbers();
        System.out.println("Sum of hundred numbers:" + numbers.sumOfHundredNumbers());
        
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

   
    }
}