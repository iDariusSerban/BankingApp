public class BankingApp {
    public static void main(String[] args) {

        Client client1 = new Client("Alex", "Stejar", 5);
        Client client2 = new Client("Maria", "Pop", 5);
        Client client3 = new Client("Ion", "Popescu", 5);

        BankAccount bankAccount1 = new StudentAccount("Ro001", 9000);
        BankAccount bankAccount2 = new SpendingAccount("Ro002", 5000);

        client1.addAccount(bankAccount1);
        client1.addAccount(bankAccount2);
        client1.listAccounts();

        client1.deposit(800, bankAccount1);
        client1.deposit(500, bankAccount2);
        client1.listAccounts();
        client1.withdraw(600,bankAccount1);
        client1.listAccounts();
    }

}
