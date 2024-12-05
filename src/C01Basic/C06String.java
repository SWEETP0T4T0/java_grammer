package C01Basic;

import java.util.ArrayList;
import java.util.List;

public class C06String {
    public static void main(String[] args) {
/*
//        참조자료형 : 기본 자료형을 제외한 모든 자료형. 클래스 기반
//        wrapperClass : 기본형 타입을 Wrapping한 클래스
        int a = 10;
        Integer b = new Integer(10);
//        오토 언박싱 : WrapperClass -> 기본자료형
        int c = b;

//        오토 박싱 : 기본자료형 -> WrapperClass 형변환
        Integer d = a;

//        String과 int의 형변환
        int a = 10;
        String st1 = Integer.toString(a);
        String st2 = String.valueOf(a);

//        String -> int
        int b = Integer.parseInt(st1);

//        배열에는 원시타입 자료형 세팅
        int[] arr1 = {10, 20, 30};

//        리스트에는 참조자료형 세팅
//        참조자료형에 원시자료형을 담을때엔 WrapperClass를 사용해야함
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);


        String st1 = new String("hello world");
        //리터럴 형식 허용 : 권장되는 방식 ( 문자pool을 통해 성능향상)
        String st2 = "hello world";
        String st3 = "hello world";

        //참조자료형 이므로 힙주소가 달라 값을 비교할때는 .equals 사용
        System.out.println(st1.equals(st2));

//        .equals중에 대소문자무시
        System.out.println(st2.equalsIgnoreCase(st3));


//        문자열의 길이
        String st1 = "hello1 java1 world2";
        System.out.println(st1.length());
//        소문자알파벳의 개수 구하기
        int count;
        for (int i=0, i<st1.length();i++){
            if (st1.charAt(i) >= 'a' && st1.charAt(i) <= 'z') {
                count++;
            }
        }
        System.out.println(count);

        String st2 = "abcdefabaadf";
        int count = 0;
        for (int i = 0; i < st2.length(); i++) {
            if (st2.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);

//        toCharArray() : String문자열을 char배열로 리턴
        String st2 = "abcdefabaadf";
        int count = 0;
        for (char ch : st2.toCharArray()) {
            if (ch == 'a') {
                count++;
            }
        }
        System.out.println(count);
   */

        String st1 = "hello java java";
//        indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치.
        System.out.println(st1.indexOf("java"));
        int num = st1.indexOf("java");
        System.out.println(num);

//        contains : 특정 문자열이 있는지 여부를 boolean
        System.out.println(st1.contains("hello"));
        System.out.println(st1.contains("world"));

















        }

    }