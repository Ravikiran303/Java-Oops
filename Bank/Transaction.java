class Transaction {

    void transfer(Account sender, Account receiver, int amount) {
        sender.withDraw(amount);
        receiver.deposit(amount);
    }
}