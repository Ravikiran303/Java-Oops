class NumbersDemo {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.PrintNumbers();
        
        
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

   

   
    }
}