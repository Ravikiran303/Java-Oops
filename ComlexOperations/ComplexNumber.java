class ComplexNumber {
    int realNum;
    int imaginaryNum;

    ComplexNumber(int realNum, int imaginaryNum) {
        this.realNum = realNum;
        this.imaginaryNum = imaginaryNum;
    }

    int getRealNum() {
        return realNum;
    }

    int getImaginaryNum() {
        return imaginaryNum;
    }

    void addComplexNumber(int realNum, int imaginaryNum) {
        this.realNum += realNum;
        this.imaginaryNum += imaginaryNum;
    }

    void subtract(int realNum, int imaginaryNum) {
        this.realNum -= realNum;
        this.imaginaryNum -= imaginaryNum;
    }

    void addComplexNumber(ComplexNumber c) {
        this.realNum += c.getRealNum();
        this.imaginaryNum += c.getImaginaryNum();
    }

    void subComplexNumber(ComplexNumber c) {
        this.realNum -= c.getRealNum();
        this.imaginaryNum -= c.getImaginaryNum();
    }
}