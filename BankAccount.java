
public class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        if (initialBalance < 0) {
            System.out.println("잘못된 초기 잔액");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("잘못된 입금 금액");
            return;
        }

        this.balance += amount;
    }

    public boolean withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("잘못된 출금 금액");
            return false;
        }

        if (amount > this.balance) {
            System.out.println("잔액이 부족합니다");
            return false;
        }

        this.balance -= amount;
        return true;
    }

    public void transferTo(BankAccount target, int amount) {
        if (target == null) {
            System.out.println("받는 계좌가 없습니다");
            return;
        }

        if (target == this) {
            System.out.println("같은 계좌에 송금할 수 없습니다");
            return;
        }

        if (!withdraw(amount)) {
            return;
        }

        target.deposit(amount);
    }

    public int getBalance() {
        return balance;
    }
}
