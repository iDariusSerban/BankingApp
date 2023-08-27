import java.util.Arrays;

public class Client {

    private String fisrtName;
    private String lastName;

    BankAccount[] accountList;

    public Client(String fisrtName, String lastName, int numberOfAccounts) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.accountList = new BankAccount[numberOfAccounts];
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean addAccount(BankAccount bankAccount) {
        // inainte sa adaug contul ma asigur ca nu s-a depasit numarul de conturi disponibile pentru client
        for (int i = 0; i < accountList.length; i++) {
            if (accountList[i] == null) {
                accountList[i] = bankAccount;
                return true;
            }
        }
        return false;
    }

    public void listAccounts() {
        for (int i = 0; i < accountList.length; i++) {
            if (accountList[i] != null) {
                System.out.println("In contul " + accountList[i].getAccountNumber() + " este suma: " + accountList[i].getBalance());

            }
        }
    }

    public int deposit(int sum, String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        account.deposit(sum);
        return account.getBalance();
    }

    public int withdraw(int sum, String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        account.deposit(sum);
        return account.getBalance();
    }

    public BankAccount findAccount (String accountNumber){
        for (int i = 0; i < accountList.length; i++) {
            if (accountNumber.equals(accountList[i].getAccountNumber())) {
                return accountList[i];
            }
        }
        return null;
    }

    public void checkAccountDetails(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        System.out.println(account.toString());
        System.out.println(fisrtName + " " + lastName);

    }
}
