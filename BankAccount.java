
public class BankAccount {
    int balance;

    BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("잘못된 입금 금액");
        } else {
            this.balance += amount;
        }
    }

    void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("잘못된 출금 금액");
        } else if (amount > balance) {
            System.out.println("잔액 부족");
        } else {
            this.balance -= amount;
        }
    }

    int getBalance() {
        return balance;
    }
}
