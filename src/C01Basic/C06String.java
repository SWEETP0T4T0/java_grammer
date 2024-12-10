package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

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

        String st1 = "hello java java";
//        indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치.
        System.out.println(st1.indexOf("java"));
        int num = st1.indexOf("java");
        System.out.println(num);

//        contains : 특정 문자열이 있는지 여부를 boolean
        System.out.println(st1.contains("hello"));
        System.out.println(st1.contains("world"));



//        문자열 더하기 : +=
        String st1 = "hello";
        st1 += "world";          //성능이 유의미하게 좋지않다


//      substring(a,b) : a이상 b미만의 index의 문자열 잘라 반환
        String st1 = "hello world";
        System.out.println(st1.substring(0, 5));
        System.out.println(st1.substring(6, st1.length()));
        String my_string = "abcdef";
        String letter = "f";
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (!my_string.substring(i, i + 1).equals(letter)) {
                answer += my_string.substring(i, i + 1);
            }
        }

//        trim, strip : 문자열 양쪽 끝의 공백 제거
        String st1 = " hello world ";
        String trimSt1 = st1.trim();
        String stripSt1 = st1.strip();
        System.out.println("trimSt1 = " + trimSt1);
        System.out.println("stripSt1 = " + stripSt1);


//        toUpperCase : 대문자로 변환  /  toLowerCase : 소문자로 변환
        String s1 = "HeLlo";
        String s2 = s1.toUpperCase();
        String s3 = s1.toLowerCase();
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

//        char에서 String으로 형변환
        char ch1 = 'a';
        String st1 = Character.toString(ch1);

//        String에서 char로 형변환
        char[] ch2 = st1.toCharArray();
        char ch3 = st1.charAt(0);

//        replace(a,b) a문자열을 b문자열로 대체한다
        String st1 = "hello world";
        String st2 = st1.replace("world", "ja va");
        System.out.println(st2);


//        replaceAll(a,b) : replace와 동일, 정규표현식을 쓸 수 있는것이 차이.
        String st1 = "01abc123한글123";

//        for문을 활용해서 소문자알파벳만 제거한 새로운 문자열 생성
        String anwser = "";
        for (int i = 0; i < st1.length(); i++) {
            if (st1.charAt(i) < 'a' || st1.charAt(i) >'z'){
                anwser += st1.charAt(i);
            }
        }
        System.out.println(anwser);

        String answer2 = st1.replaceAll("[0-9]+", "");
        System.out.println("answer2 = " + answer2);
//        대소문자 포함할경우 [A-Za-z]+

        String input = "hello가나다";
        System.out.println(input.matches("[A-Za-z]"));
        if (input.matches("[A-Za-z]+")) {
            System.out.println("제대로 입력하셨습니다");
        } else {
            System.out.println("틀렸습니다. 입력을 확인 해 주세요");
        }

//        전화번호 검증
        String number = "010-1234-1234";
        boolean b1 = Pattern.matches("^\\d{3}or\\d{6}-\\d{4}-\\d{4}$", number);
        System.out.println(b1);

//        이메일 검증 : 소문자@소문자.com
        String email = "h1e2l3l4o5@naver.com";
        boolean b2 = Pattern.matches("^[a-z0-9]+@+[a-z]+.com$", email);
        System.out.println(b2);


//       split : 특정문자를 기준으로 문자열을 자르는 것
        String a = "a:b:c:d";
        String[] arr1 = a.split(":");
        System.out.println(Arrays.toString(arr1));
        String b = "a b c  d";
        String[] arr2 = b.split(" ");
        System.out.println(Arrays.toString(arr2));
        String[] arr3 = b.split("\\s+");
//        \s = 공백
        System.out.println(Arrays.toString(arr3));
        */

        /* 정규표현식을 안쓰고 푸는법
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != "") {
                count++;
            }
        }
        System.out.println(count);


//        null과 공백의 차이
        String st1 = null;           //null은 string이 아님
        String st2 = "";
        String st3 = "hello";
        System.out.println(st3.isEmpty());   // true
        System.out.println(st2.isEmpty());   // true
        System.out.println(st2.isBlank());   // true
        //System.out.println(st1.isEmpty());   // Error : NullPointerException 발생

        String[] arr = {"hello", "java", null, "python"};
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].equals("python")) {
                answer = i;
            }
        }
        System.out.println(answer);


//        StringBuffer : 문자열 조립
//        1번
        String[] arr = {"java", "python", "javascript"};
        String answer = "";
        for (String a : arr) {
            answer += a;                //재선언하는것이라 연산속도가 느림
        }

//        2번
        String answer2 = String.join(":", arr);
        System.out.println(answer2);


//        3번 StringBuffer 사용
        StringBuffer sb = new StringBuffer();
        sb.append("java").append("python").append("javascript");
        String answer = sb.toString();
        System.out.println(answer);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("java").append("\n").append("python").append("\n").append("javascript").insert(2,"C++");
        String answer3 = sb2.toString();
        System.out.println("answer3 = " + "\n"+ answer3);

        */

//        문자열 뒤집기
        String st1 = "hello";
        String answer = "";
        StringBuilder sb1 = new StringBuilder();
        for (int i = st1.length()-1; i >= 0; i--) {
            sb1.append(st1.charAt(i));
        }
        answer = sb1.toString();
        System.out.println(answer);

//        2
        StringBuilder sb = new StringBuilder(st1);
        String answer2 = sb.reverse().toString();










        }

    }