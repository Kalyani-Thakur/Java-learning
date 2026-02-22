
import java.util.ArrayList;

class Book{
    String Book, AuName;

    Book(String Book, String AuName){
        this.Book = Book;
        this.AuName = AuName;
        
    }
    public String toString() {
        return "Title: " + Book + ", Author: " + AuName;
    }
}
public class LibraryManagementSystem { 
    ArrayList<Book> books;
   
    LibraryManagementSystem(){
        books = new ArrayList<Book>();    
    }

    void addBook(Book book){
        this.books.add(book);
        System.out.print("Added book: \n" + book);
    }
    
    void IssueBook(Book book, String issueN){
        System.out.println("The book is Issued to " +issueN+ "["+book+"]\n");
        this.books.remove(book);
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Art of Computer Programming", "Donald Knuth");
        Book book2 = new Book("The Java Programming Language", "James Gosling");
        Book book3 = new Book("Free Software, Free Society", "Richard M. Stallman");
        Book book4 = new Book("Hackers: Heroes of the Computer Revolution", "Steven Levy");

        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.addBook(book1);
        lms.addBook(book2);
        lms.addBook(book3);
        lms.addBook(book4);
        System.out.println("\n");

        lms.IssueBook(book4, "Kalyani\n");
        System.out.println(lms.books);

        lms.addBook(new Book("Advanced java", "KBHVB"));
        System.out.println(lms.books);
    }

}

/*
Create a library management system that is capable of issuing books to the students. 
Every book should have info like:
    1. Book name
    2. Book Author
    3. Issued to
    4. Issued on
Users should be able to add books, return issued books, issue books. 
Assume that all the users are registered with their names in the central database.
 */