package C02ClassBasic;

import javax.print.attribute.standard.MediaSize;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BoardService {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (i == 1) {
            System.out.println("서비스 번호를 입력하세요.");
            System.out.println("1.회원가입  2.회원 전체 목록 조회  3.회원 상세 조회  4.게시글 작성");
            System.out.println("5.게시물 목록 조회  6.게시물 상세 조회  7.서비스 종료");
            int a = sc.nextInt();
            if (a == 1) {
                System.out.println("회원가입 서비스 입니다");
                System.out.println("이름, 이메일, 비밀번호를 입력하세요");
                String x = br.readLine();
                String y = br.readLine();
                int z = Integer.parseInt(br.readLine());
                Author.addAuthor(x, y, z);
            } else if (a == 2) {
                System.out.println("회원 전체 목록 조회 서비스입니다.");
                Author.authorList();
            } else if (a == 3) {
                System.out.println("회원 상세 조회 서비스입니다.");
                System.out.println("ID를 입력하세요");
                int x = Integer.parseInt(br.readLine());
                Author.authorDetail(x);
            } else if (a == 4) {
                System.out.println("게시물 작성 서비스입니다.");
                System.out.println("제목과 내용, email을 입력하세요.");
                String title = br.readLine();
                String contents = br.readLine();
                String email = br.readLine();
                Post.addPost(title, contents, email);
            } else if (a == 5) {
                System.out.println("게시물 목록 조회 서비스입니다.");
                Post.postList();
            } else if (a == 6) {
                System.out.println("게시물 상세 조회 서비스입니다.");
                Post.postDetail();
            } else if (a == 7){
                System.out.println("서비스를 종료합니다.");
                i++;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}

class Author{
    static long static_id = 0L;
    private long Author_id;
    private String name;
    private String email;
    private int password;
    static List<Author> at = new ArrayList<>();

    public Author(String name, String email, int password) {
        static_id++;
        this.Author_id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }


    public static void addAuthor(String name, String email, int password) {
        for (Author x : at) {
            if (x.getName().equals(name) && x.getEmail().equals(email)) {
                System.out.println("동일한 회원이 존재합니다");
                return;
            }
        }
        Author a1 = new Author(name, email, password);
        at.add(a1);
        System.out.println("가입이 완료 되었습니다.");
        System.out.println("회원 이름 = " + a1.name + ", 이메일 = " + a1.email + ", 비밀번호 = " + a1.password);
    }

    public static void authorList(){
        for (Author a : at) {
            System.out.println("회원 ID는 "+a.Author_id+", 이메일 = "+a.email);
        }
    }

    public static long findId(String email) {
        long who = 0L;
        for (Author x : at) {
            if (x.getEmail().equals(email)){
                who = x.getAuthor_id();
            }
        }return who;
    }

    public static void authorDetail(long author_id){
        long a = 0;
        String b = "";
        String c = "";
        int d = 0;
        int e = 0;
        for (Author au : at) {
            if (au.getAuthor_id() == author_id) {
                a = au.Author_id;
                b = au.getName();
                c = au.getEmail();
                d = au.getPassword();
                e = Post.postTarget(au.getEmail());
            }
        }
        System.out.println(a+b+c+d+e);
    }

    public long getAuthor_id() {
        return Author_id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getPassword() {
        return password;
    }
}

class Post{
    static long static_id = 0L;
    private long post_id;
    private String title;
    private String contents;
    private long author_id;
    private String email;
    static List<Post> lp = new ArrayList<>();

    public Post(String title,String contents, String email) {
        static_id++;
        this.post_id = static_id;
        this.author_id = Author.findId(email);
        this.email = email;
        this.contents = contents;
        this.title = title;
    }

    public static void addPost(String title, String contents, String email) {
        Post p1 = new Post(title, contents, email);
        lp.add(p1);
        System.out.println("게시물이 등록 되었습니다.");
    }

    public static void postList(){
        for (Post p : lp) {
            System.out.println("게시글 ID = "+p.getPost_id()+"제목 : "+p.getTitle());
        }
    }

    public static void postDetail(){
        for (Post p : lp) {
            System.out.println(p.getPost_id() + p.getTitle() + p.getContents() + p.email);
        }
    }

    public static int postTarget(String email) {
        int count = 0;
        for (Post p : lp) {
            if (p.getAuthor_id() == Author.findId(email)) {
                count++;
            }
        }return count;
    }


    public long getPost_id() {
        return post_id;
    }
    public String getTitle() {
        return title;
    }
    public String getContents() {
        return contents;
    }
    public long getAuthor_id() {
        return author_id;
    }
}
