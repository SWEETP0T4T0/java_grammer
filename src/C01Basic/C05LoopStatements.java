package C01Basic;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {

        /*
        int a = 1;
        while (a <= 9) {
            System.out.println(a);
            a++;
        }
    }
}

        //입력한 숫자의 구구단 단수 출력
        while (true) {
            System.out.println("단 수를 입력 해 주세요");
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int i = 1;

            while (i < 10) {
                System.out.println(a + " X " + i + " = " + (a * i));
                i++;
            }
        }
    }
}


        //도어락 예시 > 무한반복되는 도어락키 예제
        System.out.println("비밀번호를 입력하세요");
        int b = 0;
        while (b<5) {
            int result = 1234;
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a == result) {
                System.out.println("문이 열렸습니다");
                break;
            } else System.out.println("비밀번호가 다릅니다. 입력 가능 횟수 = "+(4-b));
            b++;
            if (b == 5) {
                System.out.println("비밀번호 입력 횟수 초과");
                break;
            }
        }
        }
    }


        // do while - 무조건 1번은 실행되는 while문

        int a = 100;
        do {
            System.out.println(a);
        }
        while (a < 10) ;
    }
}


        //for문 : 초기식, 조건식, 증감식이 모두 포함 돼 있는 반복문
        int b = 2;
        while (b < 11) {
            System.out.println(b);
            b++;
        }

        for (int a = 2; a <11; a++) {
            System.out.println(a);
        }
    }
}


        //for문은 사용했던 변수명을 for문 끝난이후 다음 라인에서 재선언이 가능

        //1~10중에 홀수만 출력하기

        for (int i = 1; i < 11; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            }
        }
        }

          //1~20까지 수 중에 짝수를 모두 더한값
        int sum = 0;
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                sum = sum+ i;
            }
            }
        System.out.println(sum);
        }
        }

        // 두 수의 최대 공약수 찾기
        int a = 24;
        int b = 36;
        int min = a < b ? a : b;
        int answer = 0;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                answer = i;
            }

            }System.out.println(answer);
        }
        }

        //사용자가 입력한 숫자 n이 소수인지 아닌지 판별
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count +1;
            }
            }if (count == 2) {
            System.out.println("소수입니다");
        }else System.out.println("소수가 아닙니다");;
        }
        }

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean answer = false;
        for (int i = 2; i*i <= input; i++) {
            if (input % i == 0) {
                answer = true;
                break;
            }
            }
        if (answer == true) {
            System.out.println("소수가 아닙니다");
        }else System.out.println("소수입니다");
        }
        }

        //소수구하기 : 1과 자신을 제외한 숫자로 나누어지지 않는수
        //1~24중에 소수 출력

        //continue : 반복문의 조건식으로 이동

        //continue를 활용하여 홀수만 출력하기
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
            }
        }
        }

        //배열과 enhanced for문 (향상된 for문 - for each문)

        int[] arr = {1, 3, 5, 7};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //일반 for문으로 배열 접근
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
        //향상된 for문으로 배열 접근 : a에 arr의 값이 하나씩 담기고, 값의 갯수만큼 반복횟수가 결정
        for (int a : arr) {
            System.out.println(a);
        }

        //일반 for문으로 arr의 저장된 값 변경
        for (int i = 0; i < 4; i++) {
            arr[i] +=10;
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        //향상된 for문으로 arr의 저장된 값 변경 시도  > 원본은 변경 불가
        int total = 0;
        for (int a : arr ) {
            total += a;
        }
        System.out.println(Arrays.toString(arr));
    }
}
            //자바 변수의 유효 범위

        int num = 10;
        if (num > 1) {
            int abc = 20;
            num = 20;
            if (num > 1) {

            }
        }
        System.out.println(num); // abc를 사용했던 if문 밖에서는 abc 변수를 알수 없다.
    }
}

        //다중반복문
        //2~9단까지 출력하되 각 단마다 몇단입니다 출력

        for (int i = 1; i < 10; i++) {
            System.out.println(i+"단입니다");
            for (int j = 1; j < 10; j++) {
                System.out.println(i+" X "+j+" = "+(i*j));
            }
            }
        }
        }

        //라벨문 : 반복문에 이름을 붙이는것
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("hello world");
                if (j == 2) {
                    break;
                }
                }
            }
            }
        }

        int[][] arr = {{1, 2, 3}, {4,5,11}, {7,8,9}, {10,11,12}};

//        숫자 8을 찾아서 2,1에 있다고 출력
//          숫자 11을 찾되, 가장 먼저 찾아지는 11의 위치만 출력
        loop1:
        for (int i = 0; i < 4; i++) {
            loop2:
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 11) {
                    System.out.println("i = " + i + ", j = " + j);
                    break loop1;
                }
            }
            }
            }

        }

         */

//        100~200까지 수 중에서 가장 작은 소수를 출력
                        loop1:
        for (int i = 100; i < 201; i++) {
            boolean end = true;
            for (int j = 2; j*j <= i; j++) {
                if (i%j == 0 ) {
                    end = false;
                    break;
                }
            }
            if (end) {
                System.out.println("가장 작은 소수 = " + i);
                break loop1;
            }
            }
        }
        }





