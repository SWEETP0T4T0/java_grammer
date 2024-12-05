package C01Basic;

import java.math.BigDecimal;

public class C02Variable {

    public static void main(String[] args) {
        //정수 byte() - 2byte, int() - 4byte, long() - 8byte
/*
        byte a = 127;
        byte b = -128;
        a++;
        b--;
        System.out.println("a = " + a); // 오버플로우
        System.out.println("b = " + b); // 언더플로우

        int c = 10;
        long d = 18L;













        //소수점 오차 해결방법 : 정수로 변환 후 연산하여 추후 나눗셈으로 해결
        double total2 = 0;
        for (int i = 0l; i < 1000; i++) {
            total2 = total2 + 0.1+10;
        }
        System.out.println(total2 / 10);

        //소수점 오차 해결방법 : bigdecimal 클래스 사용
        double double1 = 1.03;
        double double2 = 0.42;
        System.out.println(double1 - double2);

        BigDecimal bd1 = new BigDecimal("1.03");
        BigDecimal bd2 = new BigDecimal("0.42");
        double result = bd1.subtract(bd2).doubleValue();
        System.out.println(result);


        //문자형 char
        char ch1 = '가';
        System.out.println("ch1 = " + ch1);

        //boolean : true or false

        boolean b1 = true;
        System.out.println("b1 = " + b1);
        //boolean 타입은 대부분 조건절에 사용된다.

        //null도 하나의 타입
        String st1 = null;
        String st2 = "";

        //타입변환
        //1. 명시적 타입변환
        char ch1  = 'a';
        int inta = ch1;
        System.out.println("inta = " + inta);

        //2. 알파벳 비교를 위한 묵시적 타입변환
        System.out.println('a' > 'b');

        // int -> double로 형변환 : 문제X
        int i1 = 10;
        double d1 = i1;

        // double -> int 형변환
        double d2 = 10.5;
        int i2 = (int)d2;

        // 알파벳 소문자 제거 문제
        String st1 = "01abcd123한글123";
        String answer = "";
        for (int i = 0; i < st1.length(); i++) {
            if (st1.charAt(i)< 'a' || st1.charAt(i) > 'z') {
                answer = answer + st1.charAt(i);
            }
        }


        //double -> int 형변환
        double d2 = 10.5;
        int i2 = (int)d2;

        // 정수/정수의 경우 소수점 절사 문제 발생
        int a = 1;
        int b = 4;
        double d = a/b;
        System.out.println(d); // 0

        //두 정수 중에 한 정수 만이라도 double로 형변환시 소수점 절사 문제 해결
        double c = (double) a/b;
        System.out.println("c = " + c);

        //변수와 상수 ,
        int a1 = 10;
    int a1 = 20; 재선언은 불가능
        a1 = 20;       //재할당은 가능
        System.out.println("a1 = " + a1);

        //상수는 초기값을 이후에 재 할당하는 것이 불가능
        //상수는 final키워드를 통해 표현 - 대문자
      final int AGES = 20;
*/
        char a = '가';
        int b = a;
        System.out.println("b = " + b);















    }
}
