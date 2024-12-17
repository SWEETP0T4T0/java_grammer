package C03Inheritance.ProtectedPackage;

import C03Inheritance.C0304ProtectedClass;

public class ProtectedTest extends C0304ProtectedClass {
    public static void main(String[] args) {

        C0304ProtectedClass c1 = new C0304ProtectedClass();

        System.out.println(c1.st4);
//        public변수 접근가능
//        System.out.println(c1.st3);
//        protected변수 접근 불가 : 상속관계 없으므로
        ProtectedTest p1 = new ProtectedTest();
        System.out.println(p1.st3);
//        상속관계인 p1을 선언해야 접근가능. 변수 c1으로는 복사본이라 접근 불가
//        System.out.println(c1.st3);
//        default변수 접근 불가 : 패키지가 다르므로 상속관계라도 접근 불가
//        private변수 접근 불가
    }
}
