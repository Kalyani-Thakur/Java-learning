
class Library {
    String[] books;
    int no_of_books;

    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added!");
    }

    void issueBook(String book){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("\n[ "+book+" ]" +" Book has been issued!");
                this.books[i]=null;
                
                System.out.println("This book does not exist");
                return;
            }
        }
    }

    void returnBook(String book){
        addBook(book);
    }

    void showAvailableBooks(){
        System.out.println("\nAvaliable books in Stock:");
        for(String book : this.books){
            if(book == null){
                continue;
            }
            System.out.println("* "+book);
        }
    }

}
public class Online_Library_4 {
    public static void main(String[] args) {
        Library L = new Library();
        L.addBook("JAVA Coding");
        L.addBook("Data Strucure and Algorithms");
        L.addBook("A Tale of Two Cities");
        L.addBook("Harry Potter");
        L.showAvailableBooks();

        L.issueBook("JAVA Coding");
        L.showAvailableBooks();
        L.returnBook("JAVA Coding");
        L.showAvailableBooks();
    }
}
/*
You have to implement a library using Java Class "Library"
Methods: addBook, issueBook, returnBook, showAvailableBooks
Properties: Array to store the available books,
Array to store the issued books
*/