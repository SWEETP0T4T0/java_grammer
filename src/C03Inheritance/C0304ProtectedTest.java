package C03Inheritance;

public class C0304ProtectedTest {
    public static void main(String[] args) {

        C0304ProtectedClass p1 = new C0304ProtectedClass();

        System.out.println(p1.st4);
        //        public변수 접근가능
        System.out.println(p1.st3);
//        protected변수 접근 가능(같은 패키지이므로)
        System.out.println(p1.st4);
//        dufault변수 접근 가능(같은 패키지이므로)
//        System.out.println(p1.st1);
//        private변수는 같은 클래스 내에서만 접근 가능

    }
}
