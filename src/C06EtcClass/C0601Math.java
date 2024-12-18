package C06EtcClass;

import java.util.Arrays;

public class C0601Math {
    public static void main(String[] args) {

//        Math.random() : 0.0~1.0 사이의 임의의 double형을 반환
        System.out.println(Math.random());
//        로또 번호 7개 뽑아보기. 0~99까지의 임의 숫자.
        int[] arr = new int[7];
        for (int i = 0; i<7; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));

//        Math.abs() : 절대값 반환
        System.out.println(Math.abs(-5));

//        Math.ceil() : 올림, Math.floor() : 내림, Math.round() : 반올림
        System.out.println(Math.ceil(5.777));
        System.out.println(Math.floor(5.7));
        System.out.println(Math.round(5.7));

//        Math.max / min : a,b의 크기 차이 비교
        System.out.println(Math.max(5, 8));
        System.out.println(Math.min(5, 8));

//        Math.pow(a,b) : a의b제곱
        System.out.println(Math.pow(5.5,3));

//        Math.sqrt() : 제곱근
        System.out.println(Math.sqrt(11));

        int n = 100;
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % 1 == 0) {
                System.out.println("소수가 아닙니다.");
                break;
            }
        }


    }
}
