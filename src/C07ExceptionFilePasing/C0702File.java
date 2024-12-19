package C07ExceptionFilePasing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C0702File{
    public static void main(String[] args) throws IOException {

////        콘솔창에 입력값 읽기
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        System.out.println(input);


////        파일에서 읽기
//        BufferedReader br2 = new BufferedReader(new FileReader("src/C07ExceptionFilePasing/test1.txt"));
//        String line = br2.readLine();
//        while (line != null) {
//            System.out.println(line);
//            line = br2.readLine();
//        }

////        NIO패키지를 활용한 파일 읽기
//        Path filePath = Paths.get("src/C07ExceptionFilePasing/test1.txt");
//
////        문자열 전체를 통째로 read
////        String st1 = Files.readString(filePath);
////        System.out.println(st1);
//
////        문자열을 라인별로 잘라 list형태로 read
//        List<String> st2 = Files.readAllLines(filePath);
//        for (String s : st2) {
//            System.out.println(s);
//        }

//        파일쓰기
        Path filePath = Paths.get("src/C07ExceptionFilePasing/test1.txt");
//        APPEND:추가모드, WRITE:덮어쓰기
        Files.write(filePath, "홍길동4\n".getBytes(), StandardOpenOption.APPEND);
//        Files.write(filePath, "홍길동4\n".getBytes(), StandardOpenOption.WRITE);








    }



}
