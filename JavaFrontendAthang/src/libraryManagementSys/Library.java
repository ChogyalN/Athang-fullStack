package libraryManagementSys;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Library implements LibraryInterface{
    Book book;
    List<Book> allBooks = new ArrayList<>();
    Set<Book> booksSet = new HashSet<>();
    @Override
    public Set<Book> addBooks(Book book) {
      return null;
    }

    @Override
    public List<Book> issueBooks(Member member, Book book) {
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
