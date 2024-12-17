package C04Interface.BankService;

import com.sun.source.tree.IfTree;

public class BankCardService implements BankService{

    int money;

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

//    입금시
//    xx원 카드로 입금 되었습니다.
//    현재 잔액은 xx원입니다.

//    출금시
//    xx원 카드로 출금 되었습니다.
//    현재 잔액은 yy원 입니다.　
