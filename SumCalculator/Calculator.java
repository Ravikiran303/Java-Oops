class Calculator {
    private double firstNumber;
    private double secondNumber;

    Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    double getSumResult() {
        return firstNumber + secondNumber;
    }

    double getSubtractionResult() {
        return (firstNumber - secondNumber);
    }

    double getMultiplicationResult() {
        return (firstNumber * secondNumber);
    }

    double getDivisionResult() {
        if (secondNumber == 0)
            return 0;
        return (firstNumber / secondNumber);
    }

    double getFirstNum() {
        return firstNumber;
    }

    double getSecondNum() {
        return secondNumber;
    }
}