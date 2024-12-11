package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) {

////        queue인터페이스를 LinkedList가 구현한 방식을 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
////        myQue에 가장 앞의 데이터를 삭제하면서 반환
//        System.out.println(myQue.poll());
//        System.out.println(myQue);
////        삭제하진 않고 가장 앞의 데이터를 조회만
//        System.out.println(myQue.peek());
//        System.out.println(myQue);

//        LinkedList와 ArrayList 성능비교
//        중간 위치에 데이터 add 테스트
//        LinkedList<Integer> list1 = new LinkedList<>();
//
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            list1.add(0, 10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("속도 = " + (endTime-startTime));
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//
//        long startTime2 = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            list2.add(0, 10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("속도 = " + (endTime2-startTime2));
//
////        조회속도 비교
////        LinkedList 조회 속도
//        long startTime3 = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("속도 = " + (endTime3-startTime3));
//
//
////        ArrayList의 조회 속도
//        long startTime4 = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            list2.get(i);
//        }
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("속도 = " + (endTime4-startTime4));
//
//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        while (!myQue.isEmpty()) {
//            System.out.println(myQue.poll());
//        }
//
//
////        길이제한큐 : ArrayBlockingQueue
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.add("문서1");
//        blockingQueue.add("문서2");
//        blockingQueue.add("문서3");
//        System.out.println(blockingQueue);
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4");
//        System.out.println(blockingQueue);
//

//        우선순위 큐 : 데이터를 꺼낼 때 정렬된 데이터 poll
////        전체 정렬이 아닌 poll할 때 마다 최소값을 보장
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }
//
////        최대힙인경우
//        Queue<Integer> maxpq = new PriorityQueue<>(Comparator.reverseOrder());
//        maxpq.add(10);
//        maxpq.add(20);
//        maxpq.add(30);
//        maxpq.add(40);
//        System.out.println(maxpq);
//        System.out.println(maxpq.poll());

////        stack
//        Stack<Integer> st = new Stack<>();
//        st.push(10);
//        st.push(20);
//        st.push(30);
//        System.out.println(st.pop());
//        System.out.println(st.peek());
//        System.out.println(st.size());
//        System.out.println(st.isEmpty());
//
//        while (!st.isEmpty()) {
//            System.out.println(st.pop());
//        }

//        Deque : addFirst, addLast, pollFirst, pollLast 가능
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addLast(10);
        d1.addLast(20);
        System.out.println(d1);
        d1.addFirst(30);
        System.out.println(d1);
        System.out.println(d1.peekFirst());
        System.out.println(d1.peekLast());
        System.out.println(d1.pollLast());
        System.out.println(d1.pollFirst());



    }
}
