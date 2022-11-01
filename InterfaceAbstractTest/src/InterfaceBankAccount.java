public interface InterfaceBankAccount {
    public final String Bank = "BANK INDONESIA";
    public void deposit(int amt);
    public void withdraw(int amt);
    public int getBalance();
    public String getBankName();
    public void print();
}
