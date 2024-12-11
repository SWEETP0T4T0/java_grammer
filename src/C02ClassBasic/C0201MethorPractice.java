package C02ClassBasic;

public class C0201MethorPractice {
    public static void main(String[] args) {

        if (isPrime(101)) {
            System.out.println("소수입니다");
        } else {
            System.out.println("소수가 아닙니다");
        }
    }

    public static boolean isPrime(int input) {
        boolean is = true;

        int count = 0;
        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                count = count +1;
            }
        }if (count != 1) {
            is = false;
        }
        return is;
    }
}
