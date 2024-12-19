package C07ExceptionFilePasing;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C0703JsonParsing {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Path filePath = Paths.get("src/C07ExceptionFilePasing/json1.json");
        String st1 = Files.readString(filePath);
        System.out.println(st1);

//        readTree : 트리구조의 JsonNode객체로 변환

//        readValue : 바로 java 객체로 변환

    }
}
