package C02ClassBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C0206ClassPractice {
    public static void main(String[] args) {

//        Account를 담을 자료구조로서 List사용
        List<Account> accounts = new ArrayList<>();
        Account a1 = new Account("111111", 100000);
        Account a2 = new Account("222222", 100000);
        accounts.add(a1);
        accounts.add(a2);

//        계좌번호 목록조회
        for (Account a : accounts) {
            System.out.println(a.getAcnumber());
        }

//        사용자1이 사용자2에게 돈을 보내는 상황 : 계좌번호를 알고 있는 상황.
        for (Account a : accounts) {
            if (a.getAcnumber().equals("111111")) {
                a.setBalance(a.getBalance() - 50000);
            }
            if (a.getAcnumber().equals("222222")) {
                a.setBalance(a.getBalance() + 50000);
            }
        }

//        계좌번호 잔고조회
        for (Account a : accounts) {
            System.out.println("계좌번호는 "+a.getAcnumber()+" 잔고는 "+a.getBalance());
        }

//        Map을 자료구조로 사용시
        Map<String, Account> map = new HashMap<>();
        map.put("1234", new Account("1234", 100000));
        map.put("4321", new Account("4321", 100000));

        Account myAccount = map.get("1234");
        Account yourAccount = map.get("4321");
        myAccount.setBalance(myAccount.getBalance() - 50000);
        yourAccount.setBalance(yourAccount.getBalance() + 50000);

    }
}

class Account{
    private String acnumber;
    private int balance;

    public Account(String acnumber, int balance) {
        this.acnumber = acnumber;
        this.balance = balance;
    }

    public String getAcnumber() {
        return acnumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
