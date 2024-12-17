package C04Interface.BankService;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {

        System.out.println("계좌번호를 입력 해 주세요.");

        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();

        BankAccount ba = new BankAccount(accountNumber, 0);
        while (true) {
            System.out.println("입금은 1번, 출금은 2번");
            String input = sc.nextLine();
            if (input.equals("1")) {
                System.out.println("입금 금액을 입력 해 주세요");
//                카드서비스 객체 생성

                int money = Integer.parseInt(sc.nextLine());

                System.out.println("입금 방식을 선택 해 주세요. 1. 카드 2. 카카오페이");
                String input2 = sc.nextLine();
                BankService bs;
                if (input2.equals("1")) {
                    bs = new BankCardService();
                    bs.deposit(money, ba);
//                    card
                } else if (input2.equals("2")) {
                    bs = new BankKakaoService();
                    bs.deposit(money, ba);
//                    kakao 서비스 객체 생성

                } else {
                    System.out.println("다시 입력 해 주세요");
                }

            } else if (input.equals("2")) {
                System.out.println("출금 금액을 입력 해 주세요");
                int money = Integer.parseInt(sc.nextLine());

                System.out.println("출금 방식을 선택 해 주세요. 1. 카드 2. 카카오페이");
                String input2 = sc.nextLine();
                BankService bs;
                if (input2.equals("1")) {
                    bs = new BankCardService();
                    bs.withdraw(money, ba);
//                    card
                } else if (input2.equals("2")) {
                    bs = new BankKakaoService();
                    bs.withdraw(money, ba);
//                    kakao
                } else {
                    System.out.println("다시 입력 해 주세요");
                }
                System.out.println("출금 방식을 선택 해 주세요. 1. 카드 2. 카카오페이");

            } else {
                System.out.println("다시 입력 해 주세요");
            }
        }
    }
}
