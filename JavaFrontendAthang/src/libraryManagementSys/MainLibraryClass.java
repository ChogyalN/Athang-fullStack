package libraryManagementSys;

public class MainLibraryClass {
    public static void main(String[] args) {
        Member chogyal = new Member("Chogyal", 1);
        Member tashi = new Member("Tashi Wangmo", 2);

        Book book = new Book();
        book.setAuthor("Dalai Lama");
        book.setTitle("The Tibetan Book of Living and Dying");
        book.setIsbn("ISB109308");
        book.setMemberId(1);

        LibraryInterface bookDetails = new Library();
        System.out.println(bookDetails.addBooks(book));

        System.out.println("@@@ The list of books are: ");
        System.out.println(new Library().displayBooks());
        // return books
//        if(bookDetails.returnBook(chogyal)){
//            System.out.println("The book is successfully returned.");
//        }else{
//            System.out.println("The book is not yet returned.");
//        }

    }
}
