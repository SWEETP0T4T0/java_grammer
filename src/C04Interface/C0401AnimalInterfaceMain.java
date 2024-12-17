package C04Interface;

public class C0401AnimalInterfaceMain {
    public static void main(String[] args) {
//        C0401Cat c1 = new C0401Cat();
//        c1.makeSound();
//        C0401Dog d1 = new C0401Dog();
//        d1.makeSound();

//
////        다형성 : 하나의 객체가 여러개의 참조변수 타입을 가질 수 있음을 의미.
//        C0401AnimalInterface1 c2 = new C0401Cat();
//        c1.makeSound();
//        C0401AnimalInterface1 d2 = new C0401Dog();
//        d1.makeSound();

        C0401CatMultiImpl c1 = new C0401CatMultiImpl();
        c1.makeSound();

        C0401DogMultiImpl d1 = new C0401DogMultiImpl();
        System.out.println(d1.play("진돗개", "시바견"));

//       기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나,
//        익명객체 방식으로 생성가능    -> 클래스가 없으므로 이름이 없음
        C0401AnimalInterface1 ci1 = new C0401AnimalInterface1() {
            @Override
            public void makeSound() {
                System.out.println("hello world");
            }
        };
        ci1.makeSound();
    }
}

