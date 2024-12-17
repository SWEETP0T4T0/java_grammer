package C04Interface.BankService;

public class BankKakaoService implements BankService{
    @Override
    public void deposit(int money, BankAccount ba) {
        int current = ba.getBalance();
        int balance = current + money;
        ba.updateBalance(balance);
        System.out.println(money + "원 입금 되었습니다.");
        System.out.println("현재 잔액은 "+balance+"원 입니다");

    }

    @Override
    public void withdraw(int money, BankAccount ba) {
        int current = ba.getBalance();
        if (current < money) {
            System.out.println("잔액부족 입니다");
            return;
        } else {
            int balance = current - money;
            ba.updateBalance(balance);
            System.out.println(money + "원 출금 되었습니다.");
            System.out.println("현재 잔액은 "+balance+"원 입니다");
        }

    }
}
