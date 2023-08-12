public class SpendingAccount extends BankAccount {

    private int maxWithdrawalAmount;

    public SpendingAccount(String accountNumber, int maxWithdrawalAmount) {
        super(accountNumber);
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    public int getMaxWithdrawalAmount() {
        return maxWithdrawalAmount;
    }

    public void setMaxWithdrawalAmount(int maxWithdrawalAmount) {
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    @Override
    public boolean withdraw(int sum) {
        if (maxWithdrawalAmount + getBalance() >= sum) {
            setBalance(getBalance() - sum);
            return true;
        }
        return false;
    }

    @Override
    public boolean deposit(int sum) {
        setBalance(getBalance() + sum);
        return true;
    }
}
