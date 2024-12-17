package C03Inheritance;


import java.util.List;

// final 클래스는 상속 불가
//
public class C0305Others {
    public static void main(String[] args) {
        AbstractDog d1 = new AbstractDog();
        d1.makeSound1();
        d1.makesound2();

//        추상클래스와 인터페이스는 별도의 구현없이 객체생성 불가능
//        AbstractAnimal a1 = new AbstractAnimal();
//        List<Integer> list1 = new List<Integer>();



    }

}

// abstract메서드가 하나라도 있으면 반드시 클래스에도 abstract키워드가 붙어야함
abstract class AbstractAnimal{
    void makeSound1(){
        System.out.println("동물 소리를 냅니다.");
    }

//    리턴타입과 매개변수만 있는 메서드 선언만 존재.
    abstract void makesound2();
}

class AbstractDog extends AbstractAnimal{

//    abstract 클래스를 상속 받을 때에는 overriding이 강제됨.
    @Override
    void makesound2() {
        System.out.println("멍멍");
    }
}









final class FinalParents{

}
