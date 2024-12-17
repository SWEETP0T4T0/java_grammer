package C05AnonymousLambda;

public class C0502AnonymousClass {
    public static void main(String[] args) {


//        AbstractAnimal을 상속한 클래스가 별도로 존재하지 않고,
//        익명의 클래스가 만들어짐과 동시에 익명객체가 생성되고 있음
        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound1() {

            }
        };

        Animal1 ai1 = new Animal1() {
            @Override
            public void makesound() {
                System.out.println("동물은 소리를 냅니다");
            }
        };

        ai1.makesound();

//        () {
//                System.out.println("동물은 소리를 냅니다");
//            }
//        는
//        () -> System.out.println("동물은 소리를 낼까요"); 와 동일하다.


//        익명객체에 구현메서드가 1개밖에 없을떄에는 람다표현식(화살표함수)로 표현가능
//        ()부분에 매개변수가 지정.
        Animal1 ai2 = () -> System.out.println("동물은 소리를 낼까요");

        ai2.makesound();

        Animal2 ai3 = (a, b, c)-> {
            return a + " " + b + " " + c;
        };

//        Animal2의 메서드를 활용해서 hello, world, java를 매개변수로 넣어 리턴되는값을 출력

        System.out.println(ai3.makesound("hello", "world", "java"));

        Animal3 animal3 = (a, b, c)->{
            if (c > 10) {
                return a+b;
            }else {
                return a;
            }
        };

        System.out.println(animal3.makesound("쌀","떡볶이",20));
        System.out.println(animal3.makesound("쌀","떡볶이",5));

    }
}

abstract class AbstractAnimal{

    abstract void makeSound1();

    void makesound2(){


    }
}

interface Animal1{

    void makesound();
}

interface Animal2{

    String makesound (String a, String b, String c);
}

interface Animal3{

    String makesound (String a, String b, int c);
}

