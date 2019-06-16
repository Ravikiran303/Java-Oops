class MoneyDemo {
    public static void main(String[] args) {
        Money money = new Money();
        money.setValue(5);
        Money money1 = new Money();
        money1.setValue(5);
        System.out.println(money.equals(money1));
        System.out.println(money.addition(money1));
    }
}

class Money {
    int value;

    void setValue(int value) {
        this.value = value;
    }

    public boolean equals(Object o) {
        Money money = (Money) o;
        if (money == null) {
            return false;
        }
        if (!(o instanceof Money)) {
            return false;
        }
        return this.value == money.value;
    }

    int addition(Money money) {
        return this.value + money.value;
    }

}