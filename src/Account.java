/**
 * A class is similar to a real life object or a thing.
 * A class has properties and methods (what operations are allowed on the class).
 */
public class Account {
    /*properties*/
    int accountNumber;
    String accountHolderName;
    double accountBalance = 0;
    String homeBankBranchName;
    String bankName;
    Address customerAddress;

    private String password;

    /**
     * this method tells if account has enough balance.
     * @return
     */
    public String balanceStatus() {
        if(this.accountBalance > 0) {
            return "Account balance is positive";
        } else if(this.accountBalance < 0) {
            return "Not enough balance";
        } else {
            return "Account balance is zero";
        }
    }

    /**
     * this method returns the current account balance.
     * @return
     */
    public double checkAccountBalance() {
        return this.accountBalance;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    /**
     * this method sets the account holder name.
     * @param accountHolderName
     */
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getPassword() {
        return "Password can not be shown to user!!!";
    }

    public void setPassword(String myPassword) {
        this.password = myPassword;
    }
}
