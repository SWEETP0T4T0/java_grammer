package C07ExceptionFilePasing.AuthorException;


import java.util.Scanner;

//사용자의 입출력을 받아 처리하는 계층(controller)
public class AuthorController {
    public static void main(String[] args) throws Exception {
        AuthorService authorService = new AuthorService();

        while (true){
            System.out.println("회원가입 1번, 로그인 2번, 회원 목록조회 3번");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equals("1")) {
                System.out.println("이름을 입력 해 주세요");
                String name = sc.nextLine();
                System.out.println("이메일을 입력 해 주세요");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력 해 주세요");
                String password = sc.nextLine();
//                email 중복 방지, password길이 8자리 이상이어야함. 미만이면 예외처리
                authorService.register(name, email, password);
            }else if (input.equals("2")){
                System.out.println("이메일을 입력 해 주세요");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력 해 주세요");
                String password = sc.nextLine();
                authorService.login(email, password);
            }else if (input.equals("3")) {
                authorService.findAll();
//                전체 목록 받아와서 출력
            }
        }

    }
}
