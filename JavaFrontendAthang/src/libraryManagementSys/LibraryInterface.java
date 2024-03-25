package libraryManagementSys;

import java.util.List;

public interface LibraryInterface {
    public List<Book> addBooks(Book book);

    public List<Book> issuedBooks(Member member);

    public boolean returnBook(Member memeber);

    public Book searchBook(String title, String author);

    public List<Book> displayBooks();
}
