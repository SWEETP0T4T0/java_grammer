package C07ExceptionFilePasing;

import java.sql.SQLException;
import java.util.Scanner;

public class C0701Exception {
    public static void main(String[] args) {

//        System.out.println("나눗셈 프로그램 입니다.");
//        Scanner sc = new Scanner(System.in);
//
////        예외가 발생할 것으로 예상되는 코드에 try로 감싼다.
//        try {
//            System.out.println("분자를 입력 해 주세요.");
//            int head = Integer.parseInt(sc.nextLine());
//            System.out.println("분모를 입력 해 주세요.");
//            int tail = Integer.parseInt(sc.nextLine());
//            int result = head / tail;
//            System.out.println("두 수를 나눈값은 " + result + "입니다");
//        } catch (ArithmeticException error) {
//            System.out.println("0으로 나누시면 안됩니다");
//            error.printStackTrace();
//        } catch (NumberFormatException error) {
//            System.out.println("숫자만 입력 해 주세요.");
//            error.printStackTrace();
//        }
////        Exception 클래스는 모든 예외의 조상 클래스
//        catch (Exception e) {
//            System.out.println("예상치 못한 예외가 발생했습니다.");
//            System.out.println(e.getMessage());
//        }
////        예외가 발생하든 하지않든 무조건 실행되는 구문
//        finally {
//            System.out.println("무조건 실행되는 구문입니다.");
//        }
//        System.out.println("감사합니다");

        System.out.println("로그인을 위한 비밀번호를 입력 해 주세요.");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
//        login(password);

//        check exception일 경우에 예외처리를 위임 받게 되면 반드시 예외처리를 해 줘야한다.
        try {
            login2(password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    throws 키워드를 통해 예외를 위임. 다만, uncheck예외 에서는 예외가 강제가 아니므로, throws가 큰 의미기 없음.

    static void login(String pw) throws IllegalArgumentException{
        if (pw.length() < 10) {
            System.out.println("길이가 너무 짧습니다.");
//            throw new : 예외를 강제로 발생
//            uncheck 예외는 예외처리가 강제되지 않음.
//            예외는 기본적으로 메서드를 호출한 쪽으로 전파
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        } else {
            System.out.println("로그인 되었습니다.");
        }
    }

    static void login2(String pw) throws SQLException{
        if (pw.length() < 10) {
            System.out.println("길이가 너무 짧습니다.");
//            check exception은 예외처리가 강제된다.
//            해당 메서드 내 에서 예외처리를 하든, 예외를 throws 해 줘야함.
            throw new SQLException("비밀번호가 너무 짧습니다.");
        } else {
            System.out.println("로그인 되었습니다.");
        }
    }
}
