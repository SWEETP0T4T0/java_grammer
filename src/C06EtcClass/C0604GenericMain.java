package C06EtcClass;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C0604GenericMain {
    public static void main(String[] args) {

        String[] stArr = {"java", "python", "c"};
        stChange(stArr, 0, 1);
        System.out.println(Arrays.toString(stArr));

        Integer[] intArr = {10, 20, 30};
        intChange(intArr, 0, 1);
        System.out.println(Arrays.toString(intArr));

//        generic을 사용한 메서드 활용
        genericChange(stArr, 1, 2);
        genericChange(intArr, 1, 2);
        System.out.println(Arrays.toString(stArr));
        System.out.println(Arrays.toString(intArr));


        person p1 = new person("hongildong");

//        generic을 사용하여 범용적 클래스(객체) 생성
        Genericperson<Integer> p2 = new Genericperson<>(10);
        System.out.println(p2.getValue());

//        제네릭 사용예시
        List<String> myList = new ArrayList<>();
        Stream<String> myStream;
        IntStream intStream;
        Optional<String> optionalString;
        OptionalInt optionalInt;




    }


//    제네릭메서드는 반홤타입 왼쪽에 <T>선언,
//    유의점으로 T에는 참조형변수인 객체타입 들어와야함.
    static<T> void genericChange(T[] a, int b, int c){
        T x;
        x=a[b];
        a[b]=a[c];
        a[c]=x;
    }

    static void stChange(String[] a, int b, int c){
        String x = "";
        x=a[b];
        a[b]=a[c];
        a[c]=x;
    }

    static void intChange(Integer[] a, int b, int c){
        Integer x = 0;
        x=a[b];
        a[b]=a[c];
        a[c]=x;
    }
}

class person{

    private String value;

    public person(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

//Generic클래스는 클래스명 옆에 <T>선언
class Genericperson<T>{

    private T value;

    public Genericperson(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
