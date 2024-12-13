package C02ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0209RecurCombiPermu {
    public static void main(String[] args) {
//
////        숫자가 1,2,3,4 일 때
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        System.out.println(myList);
////        myList에서 만들 수 있는 2개 짜리의 숫자 조합을 출력
//
//        List<List<Integer>> x = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        for (int i = 0; i < myList.size(); i++) {
//            temp.add(myList.get(i));
//            for (int j = i + 1; j < myList.size(); j++) {
//                temp.add(myList.get(j));
//                x.add(new ArrayList<>(temp));
//                temp.remove(temp.size() - 1);
//            }temp.remove(temp.size() - 1);
//        }
//        System.out.println(x);

//        재귀함수 호출을 통한 조합리스트 만들기

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combi(answer, temp, myList, 2, 0);
        System.out.println(answer);
        List<List<Integer>> answer2 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        permu(answer2, temp2, myList, 2, new boolean[myList.size()]);
        System.out.println(answer);

    }

    public static void combi(List<List<Integer>> answer, List<Integer> temp,
                             List<Integer> myList, int count, int shot) {
        if (temp.size() == count){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i = shot; i < myList.size(); i++) {
            temp.add(myList.get(i));
            combi(answer, temp, myList, count, i+1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void permu(List<List<Integer>> answer, List<Integer> temp,
                             List<Integer> myList, int count, boolean[] visited) {

        if (temp.size() == count) {
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp.add(myList.get(i));
                permu(answer, temp, myList, count, visited);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}
