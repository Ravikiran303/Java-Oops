class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(1, 2);
        System.out.println(calculator.getFirstNum());
        System.out.println(calculator.getSecondNum());
        System.out.println(calculator.getSumResult());
        System.out.println(calculator.getSubtractionResult());
        System.out.println(calculator.getMultiplicationResult());
    }
}