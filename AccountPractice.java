import java.util.Scanner;

public class AccountPractice {

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        manager.registerAccount("1001", 50000);
        manager.registerAccount("1002", 100000);
        manager.depositToAccount("1001", 20000);
        manager.withdrawFromAccount("1002", 30000);
        manager.transferBetweenAccounts("1001", "1002", 10000);
        System.out.println(manager.getAccountBalance("1001"));
        System.out.println(manager.getAccountBalance("1002"));
        manager.transferBetweenAccounts("1001", "1002", 100000);
        System.out.println(manager.getAccountBalance("1001"));
        System.out.println(manager.getAccountBalance("1002"));
        manager.transferBetweenAccounts("1001", "9999", 5000);
        System.out.println(manager.getAccountBalance("1001"));
        manager.transferBetweenAccounts("1001", "1002", -5000);
        System.out.println(manager.getAccountBalance("1001"));
        System.out.println(manager.getAccountBalance("1002"));
        manager.transferBetweenAccounts("1001", "1001", 5000);
        System.out.println(manager.getAccountBalance("1001"));
        System.out.println(manager.countAccountsAboveBalance(80000));
        System.out.println(manager.countAccountsAboveBalance(100000));
        System.out.println(manager.totalBalanceAtLeast(50000));
        System.out.println(manager.totalBalanceAtLeast(80000));
        System.out.println(manager.totalBalanceAtLeast(100000));
        System.out.println(manager.countAccountsInRange(50000, 80000)); 
        System.out.println(manager.countAccountsInRange(80000, 80000));
        System.out.println(manager.countAccountsInRange(90000, 100000));
        System.out.println(manager.countAccountsInRange(100000, 50000));
        System.out.println(manager.getMaxBalance());
        AccountManager emptyManager = new AccountManager();
        System.out.println(emptyManager.getMaxBalance());
        System.out.println(manager.hasAccountWithBalance(60000));
        System.out.println(manager.hasAccountWithBalance(90000));
        System.out.println(emptyManager.hasAccountWithBalance(60000));
        System.out.println(manager.getMinBalance());
        System.out.println(emptyManager.getMinBalance());

        Scanner scanner = new Scanner(System.in);
    while (true) {
    try {
        System.out.println("메뉴번호를 입력하시오");
        String input = scanner.nextLine();
        int menu = Integer.parseInt(input);
        if (menu >= 1 && menu <= 4) {
            System.out.println("입력한 번호 : " + menu);
            break;
    }
        else {
            System.out.println("올바르지 않은 값입니다");
    }
    }
    catch (NumberFormatException e) {
        System.out.println("올바르지 않은 값입니다");
    }
    }
    }
    }