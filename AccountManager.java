import java.util.HashMap;

public class AccountManager {
    private HashMap<String, BankAccount> accounts = new HashMap<>();
    // 계좌 등록
    public void registerAccount(
        String accountNum,
        int initialBalance
    ) {
        BankAccount account = accounts.get(accountNum);

        if (account != null) {
            System.out.println("이미 등록된 계좌입니다");
            return;
        }

        accounts.put(
            accountNum,
            new BankAccount(initialBalance)
        );
    }

    //계좌 찾기
    public BankAccount findAccount(String accountNum) {
        BankAccount account = accounts.get(accountNum);

        if (account == null) {
        System.out.println("계좌가 없습니다");
        return null;
    }

    return account;
}
    

    // 출금
    public void withdrawFromAccount(
        String accountNum,
        int amount
    ) {
        BankAccount account = findAccount(accountNum);

        if (account == null) {
            return;
        }

        boolean success = account.withdraw(amount);

        if (success) {
            System.out.println("출금 성공");
        }
    }

    // 계좌 간 송금
    public void transferBetweenAccounts(
        String senderNum,
        String receiverNum,
        int amount
    ) {
        BankAccount sender = findAccount(senderNum);
        BankAccount receiver = findAccount(receiverNum);

        if (sender == null || receiver == null) {
            return;
        }

        sender.transferTo(receiver, amount);
    }


// 계좌 조회
    static BankAccount findAccount(
        HashMap<String, BankAccount> accounts,
        String accountNum
    ) {
        BankAccount account = accounts.get(accountNum);

        if (account == null) {
            System.out.println("계좌가 없습니다");
            return null;
        }

        return account;
    }

    // 입금
    public void depositToAccount(String accountNum, int amount) {
    BankAccount account = findAccount(accountNum);
    if (account == null) {
        return;
}
    else {
        account.deposit(amount);
}
}

public int getAccountBalance(String accountNum) {
    BankAccount account = findAccount(accountNum);
    if (account == null) {
        return -1;
}
    else {
        return account.getBalance();
}
}

//잔액 기준 계좌 개수 조회
public int countAccountsAboveBalance(int minimumBalance) {
    int count = 0;
    for (BankAccount account : accounts.values()) {
        if (minimumBalance <= account.getBalance()) {
            count += 1;
}
}
    return count;
}

//잔액 기준 계좌 잔액 합계
public int totalBalanceAtLeast(int minimumBalance) {
    int total = 0;
    for (BankAccount account : accounts.values()) {
        if (account.getBalance() >= minimumBalance) {
            total += account.getBalance();
}
}
    return total;
}

// 잔액이 범위안에 있는 계좌 개수 
public int countAccountsInRange(int minBalance, int maxBalance) {
    if (minBalance > maxBalance) {
        return 0;
}
    int count = 0;
    for (BankAccount account : accounts.values()) {
        if (minBalance <= account.getBalance() && maxBalance >= account.getBalance()) {
            count += 1;
}
}
    return count;
}

//가장 높은 잔액
public int getMaxBalance() {
    int highestBalance = -1;
    for (BankAccount account : accounts.values()){
        if (account.getBalance() >= highestBalance) {
            highestBalance = account.getBalance();
}
}
    return highestBalance;
}

// 일치하는 잔액을 가진 계좌
public boolean hasAccountWithBalance(int targetBalance) {
    boolean exist = false;
    for (BankAccount account : accounts.values()) {
        if (account.getBalance() == targetBalance) {
            exist = true;    
}
}
    return exist;
}
}