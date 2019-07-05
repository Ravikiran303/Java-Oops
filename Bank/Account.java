class Account {
    private String acNum;
    private String userName;
    private int amount = 0;

    Account(String acNum, String userName, int amount) {
        this.acNum = acNum;
        this.userName = userName;
        this.amount = amount;
    }

    void deposit(int amount) {
        if (amount > 0) {
            this.amount += amount;
        }
    }

    int withDraw(int amount) {
        if (amount <= this.amount) {
            return this.amount = this.amount - amount;
        }
        return this.amount;
    }

    String getValues() {
        return acNum + " " + amount + " " + userName;
    }
}
