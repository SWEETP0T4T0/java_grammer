package C07ExceptionFilePasing.AuthorException;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

//저장소 역할을 하는 계층
public class AuthorRepository {
    private static List<Author> authorList = new ArrayList<>();

    public void register(Author author){
        authorList.add(author);
    }
    public Optional<Author> findByEmail(String email) throws NoSuchElementException {
//        email로 Author를 찾는 로직
        Author author1 = null;
        for (Author author : authorList) {
            if (author.getEmail().equals(email)) {
                    author1 = author;
            }
        }return Optional.ofNullable(author1);
    }

    public List<Author> findAll(){
        return authorList;
    }
}
