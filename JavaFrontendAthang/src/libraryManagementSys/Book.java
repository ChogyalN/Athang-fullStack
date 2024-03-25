package libraryManagementSys;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int memberId;

    public void setMemberId(int id){
        this.memberId = id;
    }

    public int getMemberId(){
        return memberId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", memberId=" + memberId +
                '}';
    }
}
