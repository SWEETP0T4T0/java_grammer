package C05AnonymousLambda;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.Math.min;

public class C0504StreamAPi {
    public static void main(String[] args) {
//
//        int[] arr = {20, 10, 4, 12};
//
////        전통적인 방식의 데이터 접근방식 : 메모리 주소접근
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재

//        자바에서 함수형프로그래밍을 지원하기 위한 라이브러리는 streamAPI다.
//        Arrays.stream(arr).sum();  // arr의 총 합
//        Arrays.stream(arr).forEach(a -> System.out.println(a));  //forEach는 스트림의 각 요소를 소모하면서 ㅁ동작을 수행
//
//
////        스트림의 생성 : .stream()
//        String[] arr = {"HTML", "CSS", "java", "Python"};
//        Arrays.stream(arr);
//        Stream<String> stream1 = Arrays.stream(arr);
//        List<String > myList = new ArrayList<>();
//        myList.add("HTML");
//        myList.add("CSS");
//        Stream<String> stream2 = myList.stream();
//
////        원시자료형을 가지고 stream객체를 만들게 되면, Stream<T>가 아니라, 별도의 Stream객체 존재
//        int[] intArr = {10, 20, 30, 40, 50};
//        IntStream stream3 = Arrays.stream(intArr);
//
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(10);
//        myList2.add(20);
//        myList2.add(30);
//        Stream<Integer> stream4 = myList2.stream();
//
////        stream변환(중개연산) : filter, map, sorted, distinct
//        int[] arr = {10, 10, 30, 40, 50};
//
////        filter : 특정기준으로 대상을 filtering한 뒤에 새로운 스트림을 반환.
////        아래 코드는 filter까지 스트림의 중계연산이고, sum을 통해 스트림을 모두 소모하여 총합을 구함.
//        int sum = Arrays.stream(arr).filter(a -> a <= 30).sum();
//        System.out.println(sum);
////        원시자료형의 경우 intstream으로 stream객체가 반환되므로, 제네릭타입소거 문제 발생하지 않음.
//        int[] newintArr = Arrays.stream(arr).filter(a -> a <= 30).toArray();
//        System.out.println(Arrays.toString(newintArr));
//
//        String[] stArr = {"HTML", "CSS", "java", "python"};
////        제네릭 타입소거로 인해, .toArray를 통해 바로 새로운 String배열을 만드는 것이 불가
////        제네릭 타입소거란 <String> 이러한 제네릭의 타입이 런타임시점에서는 제거되는 것을 의미
//        String[] newStArr = Arrays.stream(stArr).filter(a -> a.length() < 4).toArray(a -> new String[a]);  //a변수에는 배열의 길이가 담김
//        System.out.println(Arrays.toString(newStArr));

////        distinct : 중복제거
//        int[] intArr = {10, 10, 30, 40, 50};
//        int[] newArr = Arrays.stream(intArr).distinct().toArray();
//
////        map : 기존의 스트림을 조작하여 새로운 스트림을 반환
//        int[] newArr2 = Arrays.stream(intArr).map(a -> a * 10).toArray();
//        System.out.println(Arrays.toString(newArr2));
//
////        mapToInt : intstream형태로 변환해주는 map
//        String[] stArr = {"HTML", "CSS", "java", "python"};
//        int total = Arrays.stream(stArr).mapToInt(a -> a.length()).sum();
//        int[] newIntArr = Arrays.stream(stArr).mapToInt(a -> a.length()).toArray();
//
////        sorted : 정렬된 새로운 Stream 반환
//        String[] newStArr = Arrays.stream(stArr).sorted(Comparator.reverseOrder()).toArray(a -> new String[a]);
//        System.out.println(Arrays.toString(newStArr));
//
//        int[] arr1 = {1, 2, 3, 4, 5, 6};
////        arr1에서 홀수만 담은 배열을 arr2라는 이름으로 변환
//        int[] arr2 = Arrays.stream(arr1).filter(a-> a%2!=0).toArray();
////        arr3에 홀수만 걸러서 해당 홀수의 제곱값을 담기
//        int[] arr3 = Arrays.stream(arr1).filter(a -> a % 2 != 0).map(a -> a * a).toArray();
////        arr4에 홀수만 거르고, 제곱값을 구하고, 해당 숫자들을 오름차순해서 담기
//        int[] arr4 = Arrays.stream(arr1).filter(a -> a % 2 != 0).map(a -> a * a).sorted().toArray();
//
//        int[] intArr = {10, 20, 30, 40};
//        Arrays.stream(intArr).forEach(a -> System.out.println(a));
//        int total = Arrays.stream(intArr).sum();
////        optional객체 : 값이 있을수도 있고, 없을수도 있음을 명시한 객체
//        int max = Arrays.stream(intArr).max().getAsInt();
//        int min = Arrays.stream(intArr).min().getAsInt();
//        long count = Arrays.stream(intArr).count();
//
////        reduce : 누적연산, reduce(초기값, 연산식)
//        int allAdd = Arrays.stream(intArr).reduce(0, (a, b) -> a + b);
//        int allMultiply = Arrays.stream(intArr).reduce(1, (a, b) -> a * b);
//        String[] stArr = {"hello", "java", "world"};
//        String myString = Arrays.stream(stArr).reduce("", (a, b) -> a + b);
//        System.out.println(myString);
////        findFirst : 첫번째 요소 반환
//        String first = Arrays.stream(stArr).filter(a->a.length()>=5).findFirst().get();
//        System.out.println(first);
//
//        List<Student> students = new ArrayList<Student>();
//        students.add(new Student("kim", 20));
//        students.add(new Student("choi", 32));
//        students.add(new Student("lee", 35));
//        students.add(new Student("park", 22));
//
////        1)모든 객체의 평균나이
//        Stream<Student> students1 = students.stream();
//        Double age = students1.mapToInt(Student::getAge).average().getAsDouble();
//
//        int age1 = (int) students.stream().mapToInt(a->a.getAge()).average().getAsDouble();
////        2)가장 나이 어린 사람 찾기
////        String youngMan = students1.map(Student::getAge).min((a,b)-> min(a,b)).toString();
//
//        Student s1 = students.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).findFirst().get();
//        System.out.println(s1);
////        3)30대인 사람들의 이름을 새로운 String배열에 담기
////        String[] older = students1.map(Student::getAge).map(a -> String.valueOf(a >= 30)).toArray(String[]::new);  //클래스명::메서드명
////        System.out.println(older);
//
//        String[] newArr = students.stream().filter(a -> a.getAge() >= 30).map(a -> a.getName()).toArray(a -> new String[a]);
//        System.out.println(Arrays.toString(newArr));

////        optional 객체 : 특정 객체에 값이 없을지도 모른다는것을 명시적으로 표현
//        Optional<String> opt1 = Optional.ofNullable(null);
//        String st1 = null;
//        if (st1 != null) {
//            System.out.println(st1.compareTo("hello"));
//        } else {
//            System.out.println("값이 없습니다.");
//        }
//        if (opt1.isPresent()) {
//            System.out.println(opt1.get().compareTo("hello"));
//        }else {
//            System.out.println("값이 없습니다.");
//        }

////        Optional 객체 생성 방법 3가지
//        Optional<String> opt1 = Optional.empty();      // 비어있는 optional객체 생성
//        Optional<String> opt2 = Optional.ofNullable(null);    // 비어있는 Optional객체 생성
//        Optional<String> opt2_1 = Optional.ofNullable("hello");    // 값이 있는 Optional객체 생성
//        Optional<String> opt3 = Optional.of("hello");    // 값이 있는 경우만 Optional.of로 생성 가능
//
////        Optional 객체 처리방법 4가지
////        방법 1. isPresent()확인 후에 get()하기
//        if (opt2.isPresent()) {
//            System.out.println(opt3.get());
//        }else {
//            System.out.println("값이 없습니다.");
//        }
////        방법2. orElse() : 값이 있으면 있는값 return, 없으면 지정값 return
//        System.out.println(opt2.orElse("none"));
//
////        방법3. orElseGet() : 값이 있으면 있는 값 return, 없으면 람다함수 실행  - 잘안씀
//        System.out.println(opt2.orElseGet(()->new String("none")));
//
////        방법4. orElseThrow : 값이 있으면 있는 값 return, 없으면 지정된 예외 강제발생  -  가장많이씀
////        개발에서 사용자에게 적절한 메시지 전달 목적과 의도된 코드 중단을 목표로 강제로 예외를 발생시키는 경우가 많음.
//        System.out.println(opt2.orElseThrow(()->new NoSuchElementException("값이 없습니다")));

////        예시 1.
//        List<Student> students = new ArrayList<>();
//        OptionalDouble avg = students.stream().mapToInt(a -> a.getAge()).average();
//        if (avg.isPresent()) {
//            System.out.println(avg.getAsDouble());
//        }else {
//            throw new NoSuchElementException("값이 없습니다");
//        }
//        System.out.println(students.stream().mapToInt(a -> a.getAge()).average().orElseThrow(()->new NoSuchElementException("값이 없습니다")));


//        예시 2. DB조회 상황 가능
        System.out.println("조회하실 id를 입력 해 주세요.");
        Scanner sc = new Scanner(System.in);
        int id = Integer.parseInt(sc.nextLine());
        Optional<Student> myStudent;

        if (id < 10) {
            myStudent = Optional.of(new Student("hong", 20));
        }else {
            myStudent = Optional.empty();
        }
//        Student가 있으면 student 출력, 없으면 "해당 학생은 없습니다."라고 에러메세지와 에러 강제발생

        System.out.println(myStudent.orElseThrow(()->new NoSuchElementException("해당 학생은 없습니다.")));


















    }
}
