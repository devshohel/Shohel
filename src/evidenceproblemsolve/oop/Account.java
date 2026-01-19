
package evidenceproblemsolve.oop;
/*
Q: (Encapsolution)
1) Make the instance variables private so that they cannot be accessed directly from outside the class. 
* You can only set and get values of these variables through the methods of the class,
2) Have getter and setter methods in the class to set and get the values of the fields.
 */

//01
public class Account {

    private String accountName;
    private int accountNo;
    private double accountBalance;

    public void setAccountName(String accName) {
        this.accountName = accName;
    }

    public void setAccountNo(int accNo) {
        this.accountNo = accNo;
    }

    public void setAccountBalance(double accBalance) {
        this.accountBalance = accBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}


//02
class AccTest{
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setAccountName("Ashraful");
        ac.setAccountBalance(570500.52);
        ac.setAccountNo(1293332);
        
        System.out.println("Account Name: " + ac.getAccountName());
        System.out.println("Account No.: "+ac.getAccountNo());
        System.out.println("Account Balance: "+ac.getAccountBalance());
        
    }
}

