package C02ClassBasic;

public class C0202Class {
    public static void main(String[] args) {

//        System.out.println(Myclaculator.sum(10,20 ));
//
////        A부서의 매출
////        20원 매출
//        Myclaculator.sumAcc(20);
//        System.out.println(Myclaculator.total);
//
////        30원 매출
//        Myclaculator.sumAcc(30);
//        System.out.println(Myclaculator.total);
////        40원 매출
//        Myclaculator.sumAcc(40);
//        System.out.println(Myclaculator.total);
//
////        B부서의 매출
//
////        10원 매출
//        Myclaculator.total = 0;
//        Myclaculator.sumAcc(10);
//
////        20원 매출
//        Myclaculator.sumAcc(20);
//        System.out.println(Myclaculator.total);

//        객체를 사용한 회계 프로그램 : 객체 고유의 메모리 공간 할당
        MyclaculatorInstance m1 =new MyclaculatorInstance();
        MyclaculatorInstance.total_count ++;
        m1.sumAcc(10);
        m1.sumAcc(20);
        System.out.println(m1.total);

        MyclaculatorInstance m2 =new MyclaculatorInstance();
        MyclaculatorInstance.total_count ++;
        m2.sumAcc(30);
        m2.sumAcc(40);
        System.out.println(m2.total);

//        이름세팅, eating()메서드 호출
         C0202Penson a1 = new C0202Penson();
        a1.setName("hongildong");
        a1.setAge(30);
        a1.setEmail("hong@naver.com");
        a1.eating();
        System.out.println(a1.whoIs());
        System.out.println(a1.getName());
        System.out.println(a1.getAge());
        System.out.println(a1.getEmail());






    }
}

class Myclaculator {
//    static이 붙으면 클래스변수
//    static이 안붙으면 객체변수

    static int total = 0;

    static int sum(int a, int b){
        return a+b;
    }

    static void sumAcc(int a){
        total += a;
    }
}
class MyclaculatorInstance {
//    static이 붙으면 클래스변수
//    static이 안붙으면 객체변수
    static int total_count = 0;

    int total = 0;

    void sumAcc(int a){
//        this는 객체 그 자신을 의미
//        예를들어 m1객체일 경우 m1.total, m2일 경우 m2.total
//        매개변수(로컬변수)와 객체변수를 구분짓기 위해 사용해야함.(매개변수와 이름이 같지 않을 경우 생략가능)
        this.total += a;
    }
}
