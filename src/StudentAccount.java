public class StudentAccount extends BankAccount {

    private final int maxDepositAmount;

    public StudentAccount(String accountNumber, int maxDepositAmount) {
        super(accountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }


    public int getMaxDepositAmount() {
        return maxDepositAmount;
    }

    @Override
    public boolean withdraw(int sum) {
        // se retrage din cont suma
        // se poate retrage maxim suma existenta in cont
        if (getBalance() >= sum) {
            setBalance(getBalance() - sum);
            return true;
        }
        return false;
    }

    @Override
    public boolean deposit(int sum) {
        if (sum < maxDepositAmount) {
            setBalance(getBalance() + sum);
            return true;
        }
        return false;
    }
}
