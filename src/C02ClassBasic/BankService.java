package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankService {

    public static void main(String[] args) {

//        프로그램은 항상 실행 될 수 있도록 전체 코드를 while(true)로 처리
//        서비스 번호를 입력하세요.
//        1.개설 2.조회 3.입금 4.출금 5.송금 0.종료
//        개설 : 계좌번호와 현재 가지고 계신 돈을 입력하세요.
//        조회 : 계좌조회 서비스입니다. 계좌번호를 입력 해 주세요. 잔고출력
//        입금 : 계좌 입금 서비스입니다. 계좌번호와 입금 금액을 입력 해 주세요.
//        출금 : 계좌 출금 서비스입니다. 계좌번호와 출금 금액을 입력 해 주세요.
//        송금 : 계좌 송금 서비스입니다. 내 계좌번호, 상대 계좌번호, 송금 금액을 입력 해 주세요.
//        종료 : 서비스를 종료합니다.

        List<BankAccount> bA = new ArrayList<>();
        BankAccount test1 = new BankAccount(111111, 10000);
        BankAccount test2 = new BankAccount(222222, 20000);
        BankAccount test3 = new BankAccount(333333, 30000);
        bA.add(test1);
        bA.add(test2);
        bA.add(test3);

        int i = 1;
        Scanner sc = new Scanner(System.in);
        while (i == 1) {
            System.out.println("서비스 번호를 입력하세요.");
            System.out.println("1.개설  2.조회  3.입금  4.출금  5.송금  0.종료");
            int a = sc.nextInt();
            if (a == 1) {
                System.out.println("개설 서비스 입니다.");
                System.out.println("계좌번호와 현재 가지고 계신 돈을 입력하세요.");
                int b = sc.nextInt();
                int c = sc.nextInt();
                BankAccount b1 = new BankAccount(b, c);
                for (BankAccount x : bA) {
                    if (x.getNumber() == b) {
                        System.out.println("중복된 계좌입니다");
                        break;
                    }else {
                        bA.add(b1);
                        System.out.println("계좌가 개설 되었습니다.");
                        System.out.println("내 계좌번호 = " + b1.getNumber() + " 잔액 = " + b1.getBalance());
                        System.out.println();
                    }
                }
            } else if (a == 2) {
                System.out.println("계좌 조회 서비스 입니다.");
                System.out.println("조회하실 계좌번호를 입력 해 주세요.");
                int b = sc.nextInt();
                for (BankAccount x  : bA) {
                    if (x.getNumber() == b) {
                        System.out.println("조회하신 계좌의 잔액은 " + x.getBalance() + " 입니다");
                    }
                }
                System.out.println();
            } else if (a == 3) {
                System.out.println("계좌 입금 서비스입니다.");
                System.out.println("계좌 번호와 입금 금액을 입력 해 주세요");
                int b = sc.nextInt();
                int c = sc.nextInt();
                for (BankAccount x : bA) {
                    if (x.getNumber() == b) {
                        x.deposit(c);
                        System.out.println(b + "계좌에 입금 후 잔액은 " + x.getBalance() + "원 입니다");
                        System.out.println();
                    }
                }
            } else if (a == 4) {
                System.out.println("계좌 출금 서비스입니다.");
                System.out.println("계좌 번호와 출금 금액을 입력 해 주세요");
                int b = sc.nextInt();
                int c = sc.nextInt();
                for (BankAccount x : bA) {
                    if (x.getNumber() == b) {
                        x.Withdraw(c);
                        System.out.println("현재 잔액은 "+x.getBalance()+"원 입니다.");
                    }
                }
            } else if (a == 5) {
                System.out.println("계좌 송금 서비스입니다.");
                System.out.println("내 계좌번호, 상대 계좌번호, 송금 금액을 입력 해 주세요.");
                int b = sc.nextInt();
                int c = sc.nextInt();
                int e = sc.nextInt();
                boolean answer = true;
                for (BankAccount x : bA) {
                    if (x.getNumber() == b) {
                        x.Withdraw(e);
                        break;
                    }
                    if (x.getNumber() == c && answer){
                        x.deposit(e);
                        System.out.println("송금이 정상적으로 완료 되었습니다.");
                        System.out.println();;
                    }
                }
            } else if (a == 0) {
                System.out.println("서비스를 종료합니다.");
                i++;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }


    }
}


// Account 객체 : 자체 ID값(AutoIncrement), 계좌번호, 잔액 변수로 구성
class BankAccount{
    private int ID = 1;
    private int Number;
    private int Balance;

    public BankAccount(int number, int balance) {

        this.ID += ID;
        this.Number = number;
        this.Balance = balance;
    }

    public int getNumber() {
        return Number;
    }

    public int getBalance() {
        return Balance;
    }

    public void deposit (int 입금금액) {
        this.Balance = Balance + 입금금액;
    }

    public boolean Withdraw(int 출금금액) {
        if (this.Balance > 출금금액) {
            this.Balance -= 출금금액;
            return true;
        }else {
            System.out.println("잔액이 부족합니다.");
            return false;
        }
    }
//
//    public void transferBalance(int 상대계좌, int 송금금액){
//        if (!this.Withdraw(송금금액)) {
//            return;                -void에서 return을 만나면 메서드는 강제 종료
//        };
//        상대계좌.deposit(송금금액);
//    }
}
