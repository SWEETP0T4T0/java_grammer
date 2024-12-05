package C01Basic;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//클래스의 명령 규칙 :
// 1. 반드시 public class 이름과 파일명이 일치해야함
// 2. 일반적으로 대문자 알파벳으로 시작한다

public class C00HelloWorld {
    /*main method는 프로그램 실행 시 가장 먼저 실행되는 method다
    어디에서든 접근가능, 리턴값이 없는것이 특징이므로 public static void를 앞에 붙임.*/
    public static void main(String[] args) {
            //java는 프로그램의 범위를 중괄호{}로 구분짓고, 모든 명령문은 ;로 끝이난다.
        /*
        여러줄의 주석처리 가능. 주석처리는 기본적으로 컴파일에서 제외됨.
         */
        System.out.println("hello world");

    }
}


