public class BankAccount {
    private int balance;
    private int accountNumber;
    private String Name;
    private String email;
    private int phone;

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return Name;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void depositFunds(int amount){
        this.balance=balance+amount;
        System.out.println("New Balance = "+this.balance);
    }

    public void withdrawFunds(int amount) {
        if (this.balance-amount<0) {
            System.out.println("Insufficient Balance. Withdrawal failed");
            System.out.println("Balance = "+this.balance);

        } else {
            this.balance = balance - amount;
            System.out.println("Transaction completed. New Balance = "+this.balance);
        }
    }
}
