package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {

        /*

//        map은 index요소가 없으므로 순서가 무의미하다.
//        key값은 중복되지않고 동일한 key값으로 재 입력시 value를 덮어쓰기함
        Map<String, String> sports = new HashMap<>();
        sports.put("Basketball", "농구");
        sports.put("Soccer", "축구");
        sports.put("Baseball", "야구");
        System.out.println(sports);
        System.out.println(sports.get("Baseball"));


//        map의 전체 데이터 조회
//        keyset() : map의 key목록을 리턴하는 메서즈
//        values() : map의 value목록을 리턴하는 메서드

        for (String key : sports.keySet()) {
            System.out.println("sports의 key값은 = " + key);
            System.out.println("sports의 value값은 = " + sports.get(key));
        }

//        remove : key를 통해 삭제
        sports.remove("Baseball");
        System.out.println(sports);

//        putIfAbsent : key값이 없는 경우에만 put
        sports.putIfAbsent("Soccer", "운동");
        sports.putIfAbsent("Baseball", "야구");
        System.out.println(sports);

//        getOrDefault : key가 없으면 default값으로 return
        System.out.println(sports.getOrDefault("pingpong", "그런키없음"));

//        containsKey : 키가 있으면 True, 없으면 False
        System.out.println(sports.containsKey("Baseball"));


        String[] arr = {"농구", "축구", "농구", "야구", "축구"};
//        농구:2, 축구:2, 야구;1
        Map<String,Integer> sports = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (sports.containsKey(arr[i])) {
                sports.put(arr[i], sports.get(arr[i]) + 1);
            } else {
                sports.put(arr[i], 1);
            }
        }
        System.out.println(sports);

        String[] arr = {"농구", "축구", "농구", "야구", "축구"};
//        농구:2, 축구:2, 야구;1
        Map<String,Integer> sports = new HashMap<>();
        for (String a : arr) {
            sports.put(a, sports.getOrDefault(a,0)+1);
        }
        System.out.println(sports);


//        LinkedHashMap : 데이터 삽입순서를 보장(유지), 입력 순서대로 정렬
        Map<String,Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("hello5", 1);
        linkedMap.put("hello4", 2);
        linkedMap.put("hello3", 3);
        linkedMap.put("hello2", 4);
        linkedMap.put("hello1", 5);
        for (String l : linkedMap.keySet()) {
            System.out.println("KEY값은 " +l);
        }


//        HashMap을 사용해서 key값으로 정렬
        Map<String,Integer> mymap = new HashMap<>();
        mymap.put("hello5", 1);
        mymap.put("hello4", 2);
        mymap.put("hello3", 3);
        mymap.put("hello2", 4);
        mymap.put("hello1", 5);
        List<String> mylist = new ArrayList<>();
        for (String a : mymap.keySet()) {
            mylist.add(a);
        }
        Collections.sort(mylist);
        for (String l : mylist) {
            System.out.println("KEY값은 " +l);
        }


//        TreeMap : key를 통해 데이터를 오름차순 정렬
        Map<String,Integer> treemap = new TreeMap<>();
        treemap.put("hello5", 1);
        treemap.put("hello4", 2);
        treemap.put("hello3", 3);
        treemap.put("hello2", 4);
        treemap.put("hello1", 5);
        for (String l : treemap.keySet()) {
            System.out.println("KEY값은 " +l);
            System.out.println("VALUE값은 " +mymap.get(l));
        }

        Collections.sort(mylist, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return mymap.get(o1) - mymap.get(o2);         //Value를 기준으로 오름차순 정렬
            }
        });
        System.out.println(mylist);

         */
//
//
////        hashmap 출력 방법 2가지 : 1. 향상된 for문, 2. iterator
//        Map<String, String> mymap = new HashMap<>();
//        mymap.put("basketball", "농구");
//        mymap.put("soccer", "축구");
//        mymap.put("baseball", "야구");
////        for (String a : mymap.keySet()) {
////            System.out.println(a);
////        }
//
//
//        Iterator<String> myIters = mymap.keySet().iterator();  // values() 사용가능, map뿐만아니라 List에서도 사용가능
////        next 메서드는 데이터를 하나씩 소모시키면서 값을 반환
//        System.out.println(myIters.next());
////        hasNext는 Iterator 안에 그 다음 값이 있는지 덦는지 boolean return
//        while (myIters.hasNext()) {
//            System.out.println(myIters.next());
//        }
//

















    }
}
