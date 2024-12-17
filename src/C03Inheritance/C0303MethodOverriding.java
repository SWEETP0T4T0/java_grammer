package C03Inheritance;

public class C0303MethodOverriding {
    public static void main(String[] args) {
        Dog a1 = new Dog();
        a1.sound();
        a1.sound2();

//        상속관계 일 때 부모클래스의 타입을 자식클래스 객체의 타입으로 지정가능.
//        Animal 클래스에 정의된 메서드만 사용가능하도록 ㅏ입의 제약 발생.
        Animal a2 = new Dog();
        a2.sound();
//        a2.sound2();            사용불가


    }
}

class Animal {

    void sound() {
        System.out.println("동물이 소리를 냅니다.");

    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("멍멍멍");
    }

    void sound2(){
        System.out.println("멍멍");
    }
}
