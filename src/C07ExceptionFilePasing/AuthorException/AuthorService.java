package C07ExceptionFilePasing.AuthorException;


import java.util.NoSuchElementException;

//핵심 로직을 구현하는 계층
public class AuthorService {

    private AuthorRepository authorRepository;

    public AuthorService(){
        authorRepository = new AuthorRepository();
    }

    public void register(String name, String email, String password) throws Exception {
        if (authorRepository.findByEmail(email).isEmpty()) {
            if (password.length() < 8) {
                throw new IllegalArgumentException("길이가 너무 짧습니다");
            } else {
                this.authorRepository.register(new Author(name, email, password));
                System.out.println("가입완료");
            }
        }else {
            throw new Exception("이미 등록 된 회원입니다.");
        }
    }
    public void login(String email, String password){
        try{
            if (this.authorRepository.findByEmail(email).isPresent()){
                Author author1 = this.authorRepository.findByEmail(email).orElseThrow();
                if (author1.getPassword().equals(password)) {
                    System.out.println("로그인 되었습니다.");
                }else {
                    System.out.println("비밀번호가 다릅니다.");
                }
            }
        }catch (NoSuchElementException e){
            System.out.println("일치하는 회원이 없습니다.");
            throw new NoSuchElementException("일치하는 회원이 없습니다.");
        }
    }
    public void findAll(){
        this.authorRepository.findAll();
    }
}
