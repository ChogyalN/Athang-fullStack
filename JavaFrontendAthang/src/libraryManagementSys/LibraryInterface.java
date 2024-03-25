package libraryManagementSys;

import java.util.List;
import java.util.Set;

public interface LibraryInterface {
    public Set<Book> addBooks(Book book);

    public List<Book> issueBooks(Member member, Book book);

    public boolean returnBook(Member memeber);

    public Book searchBook(String title, String author);

    public List<Book> displayBooks();
}
