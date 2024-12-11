package C02ClassBasic;

public class C0203Scope {

//    클래스 변수는 클래스 전역에서 접근가능 - 전역변수

    static int v2 = 10;
    public static void main(String[] args) {

//        지역변수의 유효범위
        int v1 = 10;
        scope(v1);

//        객체의 유효범위
        C0202Penson p1 = new C0202Penson();
        p1.setAge(20);
        scope2(p1);
        System.out.println("main에서의 get age = "+p1.getAge());

//        클래스 변수의 유효범위
        System.out.println(v2);


    }
    public static void scope(int a){
        a = 20;
        System.out.println(a);
    }

    public static void scope2(C0202Penson person){
        person.setAge(30);
        System.out.println("scope2에서의 get age = "+person.getAge());
    }
}
