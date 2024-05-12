package exam01;

import lombok.*;

//@Getter
//@Setter
//@ToString
// @AllArgsConstructor // 기본 생성자
// @NoArgsConstructor(access = AccessLevel.PRIVATE) // 모든 멤버 변수 초기화 생성자
//@RequiredArgsConstructor
//@EqualsAndHashCode

//@Data // getter, setter, tostring, equalsandhashcode 자동추가
public class Book {
    private /*final*/ String title;
  //  @NonNull
    private String author;
    private String publisher;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}

