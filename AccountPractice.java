
public class AccountPractice {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(50000);
        BankAccount account2 = new BankAccount(100000);

        account1.deposit(20000);
        account2.withdraw(30000);

        System.out.println("계좌1 잔액: " + account1.getBalance());
        System.out.println("계좌2 잔액: " + account2.getBalance());
    }
}
