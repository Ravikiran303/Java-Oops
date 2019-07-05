class CoplexOperations {
    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(2, 3);
        complexNumber.addComplexNumber(3, 4);
        System.out.println(complexNumber.getRealNum() + " + " + complexNumber.getImaginaryNum());

        ComplexNumber complexNumber1 = new ComplexNumber(2, 3);
        complexNumber1.addComplexNumber(complexNumber1);
        System.out.println(complexNumber1.getRealNum() + " + " + complexNumber1.getImaginaryNum());
    }
}