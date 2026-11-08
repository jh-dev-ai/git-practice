
public class AccountPractice {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(50000);
        BankAccount account2 = new BankAccount(100000);

        // 정상 송금
        account1.transferTo(account2, 20000);

        // 잔액 부족
        account1.transferTo(account2, 50000);

        // 0원 송금
        account1.transferTo(account2, 0);

        // 음수 송금
        account1.transferTo(account2, -10000);

        // null 계좌 송금
        account1.transferTo(null, 20000);

        // 자기 자신에게 송금
        account1.transferTo(account1, 10000);

        // 음수 초기 잔액 검증
        BankAccount account3 = new BankAccount(-50000);

        // 최종 잔액 확인
        System.out.println("계좌1: " + account1.getBalance());
        System.out.println("계좌2: " + account2.getBalance());
        System.out.println("계좌3: " + account3.getBalance());
    }
}
