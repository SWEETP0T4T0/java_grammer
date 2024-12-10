package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C07Array {
    public static void main(String[] args) {

        /*
//        배열 표현식1. 리터럴 방식
        int[] intarr1 = {1, 3, 5, 7, 9};

//        배열 표현식2. 배열 선언 후 할당 방식
        int[] intarr2 = new int[5];      //0~4항목의 int배열
        intarr2[0] = 1;
        intarr2[1] = 3;
        intarr2[2] = 5;
        intarr2[3] = 7;
        System.out.println(intarr2[4]);  // int는 할당안할경우 0, str 은 null, boolean은 false

//        참조 자료형의 배열은 기본적으로 null로 초기화
        String[] stAtt = new String[5];
        stAtt[0] = "hello1";
        stAtt[1] = "hello2";
        stAtt[2] = "hello3";
        for (int i = 0; i < stAtt.length; i++) {
            if (stAtt[1].equals("hello10")) {
                System.out.println("hello10가 있습니다.");
            }
        } // Null Error 발생

//        표현식3
        int[] intArr3 = new int[]{1, 3, 5, 7, 9};
        List<int[]> list1 = new ArrayList<>();
        list1.add(new int[]{1, 2, 3, 4, 5});

        int[] arr1 = {85, 65, 90};
        int total = 0;
        for (int i = 0; i < arr1.length; i++) {
            total += arr1[i];
        }
        System.out.println((double) total / arr1.length);


//       배열의 최댓값, 최솟값 구하기
        int[] arr2 = {10, 20, 30, 12, 8, 17};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
            } if (arr2[i] < min){
                min = arr2[i];
            }
                }
        System.out.println(max + " / " + min);

//        배열의 자리 바꾸기
        int[] arr =  {20, 10, 30};
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;


        int[] arr2 = {10, 20, 30, 40, 50};
        int x = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (i != arr2.length-1) {
                x = arr2[i];

                arr2[i] = arr2[i + 1];
                arr2[i+1] = x;
            } else {

                arr2[0] = arr2[arr2.length-1];
            }
            }
        System.out.println(Arrays.toString(arr2));


//        배열뒤집기 : 새로운 배열을 선언하여, arr을 뒤집을 배열 생성
        int[] arr = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            int a = i-(arr.length-1);
            if (a > 0) {
                arr2[i] = arr[a];
            } else {
                arr2[i] = arr[-a];
            }
        }
        System.out.println(Arrays.toString(arr2));

//        배열의 정렬


//        Arrays.sort(arr);   : 오름차순 정렬
//        System.out.println(Arrays.toString(arr));
        int[] arr = {17, 12, 20, 10, 25};
        int x = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i] > arr[j]) {
                    x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }

            }
        }
        System.out.println(Arrays.toString(arr));


//        문자정렬 ( 아스키코드(unicode)기준으로 정렬

        String[] fruits = {"banana", "apple", "cherry"};
//        오름차순
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
//        내림차순 : 기본형타입은 Comparator로 처리 불가
        Arrays.sort(fruits, Comparator.reverseOrder());

        int[] arr = {5, 1, 2, 3, 6}; // int타입(원시타입)은 내림차순 불가, 오름차순 한 후 리버스해야함

        String[] fruits2 = {"apple", "applee", "applef"};
        Arrays.sort(fruits2);
        System.out.println(Arrays.toString(fruits2));


        int[] intArr = {10, 20, 30, 40, 50, 60};
        int[] arr1 = new int[intArr.length* intArr.length];
        int index = 0;

        for (int i = 0; i < intArr.length; i++) {
            for (int j = i+1; j < intArr.length; j++) {
                arr1[index] = intArr[i]+intArr[j];
                        index++;
                    }
                }
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[index];
        for (int i = 0; i < index; i++) {
            arr2[i] = arr1[i];
        }
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        int count = 0;
        int[] arr3 = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
                if (i==arr2.length-1 || arr2[i] != arr2[i+1]) {
                    arr3[count] = arr2[i];
                    count++;
                }
            }
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = new int[count];
        for (int i = 0; i<arr3.length; i++) {
            for (int j = i + 1; j < arr3.length; j++) {
                if (arr3[i] != 0) {
                    arr4[i]=arr3[i];
            }
            }
        }
        System.out.println(Arrays.toString(arr4));

//        배열의 복사
//        Arrays.copyOf(배열명, length), Arrays.copyOfRange(배열명, start, end)
        int[] answer1 = Arrays.copyOf(arr3, count);
        int[] answer2 = Arrays.copyOfRange(arr3, 0, count);
        System.out.println(Arrays.toString(answer1));
        System.out.println(Arrays.toString(answer2));


//        배열의 검색
        int[] arr = {5, 3, 1, 8, 7};
        int target = 8;
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                answer = i;
            }
        }
        System.out.println(answer);


//        이진검색(binary search) : 이분탐색         // 절반으로 잘라서 탐색 진행 - log2의 N만큼 복잡도
//        사전에 오름차순 정렬이 되어 있어야 이진검색 가능
//        수 찾기
        int[] arr = {1, 3, 6, 8, 9, 11, 15};
        System.out.println(Arrays.binarySearch(arr, 5));


//        배열 간 비교
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {10, 20, 30};
        System.out.println(arr1 == arr2);   // 힙주소 비교하는거라 false;

//        Arrays.equals : 값과 순서까지 동일해야 true
        System.out.println(Arrays.equals(arr1, arr2));


//        2차원 배열의 선언과 할당
        int[][] arr1 = new int[2][3];
        arr1[0][0] = 10;
        arr1[0][1] = 20;
        arr1[0][2] = 30;
        arr1[1][0] = 40;
        arr1[1][1] = 50;
        arr1[1][2] = 60;
        int[][] arr2 = {{10, 20, 30}, {40, 50, 60}};
        System.out.println(Arrays.deepEquals(arr1, arr2));

//        가변 배열 선언 후 할당.
        int[][] arr4 = new int[2][];
        arr4[0] = new int[2];
        arr4[1] = new int[3];
        arr4[0][0] = 10;
        arr4[0][1] = 20;
        arr4[1][0] = 30;
        arr4[1][1] = 40;
        arr4[1][2] = 50;

//        가변배열 리터럴 방식
        int[][] arr3 = {{10, 20}, {30, 40, 50}};
        System.out.println(Arrays.deepEquals(arr3,arr4));


//        [3][4] 사이즈 배열을 선언하고 1~12까지 숫자값을 각 배열에 순차적으로 할당
        int[][] arr1 = new int[3][4];
        arr1[0][0] = 1;
        arr1[1][0] = 5;
        arr1[2][0] = 9;
        arr1[0][1] =2;
        arr1[1][1] =6;
        arr1[2][1] =10;
        arr1[0][2] =3;
        arr1[1][2] =7;
        arr1[2][2] =11;
        arr1[0][3] =4;
        arr1[1][3] =8;
        arr1[2][3] =12;
        System.out.println(Arrays.deepToString(arr1));
        int[][] arr2 = new int[3][4];
        int num = 1;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j]=num;
                num ++;
            }
        }


        int[][] arr = new int[3][];
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[4];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=num;
                num ++;
            }
        }

         */














    }
}
