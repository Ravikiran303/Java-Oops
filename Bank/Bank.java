class Bank {
    public static void main(String[] args) {

        Account account = new Account("12345", "RR", 100);
        Account account1 = new Account("1234", "RRR", 100);
        Transaction transaction = new Transaction();
        transaction.transfer(account, account1, 50);
        System.out.println(account.getValues());
        System.out.println(account1.getValues());

    }
}