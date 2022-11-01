/*public class Account implements InterfaceBankAccount {
    String accountName;
    String accountNum;
    int balance;

    public Account(String name, String num, int bal) {
        this.accountName = name;
        this.accountNum = num;
        this.balance = bal;
    }

    public void deposit(int amt)
    {
        this.balance = this.balance + amt;
    }

    public void withdraw(int amt)
    {
        this.balance = this.balance - amt;
    }

    public int getBalance()
    {
        return this.balance;
    }

    public String getBankName()
    {
        return this.Bank;
    }

    public void print(){
        System.out.println("Bank Name: " + this.getBankName()
                + "\nAccount Name: " + this.accountName
                + "\nAccount Number: " + this. accountNum
                + "\nBalance: " + this.balance);
    }
}
*/

public class Account extends AbstractBankAccount {
    private static double bagihasil = 0.1;

    public Account(String name, String num, int amt){
        super(name, num, ((int)Account.calculateBonus(amt) + amt));
    }

    private static double calculateBonus(int amt){
        return bagihasil*amt;
    }

    @Override
    public void deposit(int amt) {
        this.balance += amt;
    }

    @Override
    public void withdraw(int amt) {
        this.balance -= amt;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public String getBankName() {
        return this.BANK;
    }

    public void print(){
        System.out.println("Bank Name: " + this.getBankName()
                + "\nAccount Name: " + this.accountName
                + "\nAccount Number: " + this. accountNum
                + "\nBalance: " + this.balance);
    }

}