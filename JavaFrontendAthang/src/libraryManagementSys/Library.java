package libraryManagementSys;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryInterface{
    Book book;
    List<Book> allBooks = new ArrayList<>();
    @Override
    public List<Book> addBooks(Book book) {
        allBooks.add(book);
        return allBooks;
    }

    @Override
    public List<Book> issuedBooks(Member member) {
        List<Book> issudBooksForPartclrMem = new ArrayList<>();
        for(Book b : allBooks){
            if(b.getMemberId() == member.getId()){
                issudBooksForPartclrMem.add(b);
            }
        }
        return issudBooksForPartclrMem;
    }

    @Override
    public boolean returnBook(Member member) {
        int length = allBooks.size();
        for(Book b : allBooks){
            if(b.getMemberId() == member.getId()){
                allBooks.remove(b);
                if(allBooks.size() == 0) break;
            }
        }
        if(length > allBooks.size()){
            return true;
        }
        return false;
    }


    @Override
    public Book searchBook(String title, String author) {
       for(Book b : allBooks){
           if(b.getTitle() == title && b.getAuthor() == author){
               return b;
           }
       }
        return null;
    }

    @Override
    public List<Book> displayBooks() {
        return this.allBooks;
    }
}
