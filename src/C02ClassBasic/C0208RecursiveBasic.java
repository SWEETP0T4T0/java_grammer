package C02ClassBasic;

import java.util.Arrays;

public class C0208RecursiveBasic {
    public static void main(String[] args) {

////        for문으로 1~10까지 누적 합계
//        int total = 0;
//        for (int i = 1; i < 11; i++) {
//            total += i;
//        }
//        System.out.println(total);
//
////        재귀함수로 누적 합계
//        System.out.println(sumAcc(10));
//
////        factorial 값 구하기 : 1부터 N까지 숫자 모두 곱하기
////        factorial(5) = 1*2*3*4*5
//        System.out.println(factorial(5));

//        피보나치 수열 구현 : 10번째
        int n = 10;
        int[] arr = new int[n];
        arr[0]= 1;
        arr[1]= 1;
        for (int i = 2; i < n; i++) {
            arr[i]= arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(fiibonacci(10));

    }
    public static int sumAcc(int n) {
        if (n == 1) {
            return 1;
        }
            return n + sumAcc(n - 1);
    }

    public static int factorial(int n){
        if (n == 1) {
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int fiibonacci(int n){
        if (n <= 2) {
            return 1;
        }
        return fiibonacci(n-1)+fiibonacci(n-2);
    }



}
