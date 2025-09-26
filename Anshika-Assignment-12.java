import java.util.ArrayList;

class Book {
    int bookID;
    String bookName;
    String authorName;
    Book(int bookID, String bookName, String authorName) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.authorName = authorName;
    }
    public String toString() {
        return "BookID : " + bookID + ", Name : " + bookName + ", Weitten by : " + authorName;
    }
}

public class Test {
    public static void main(String[] args) {
        ArrayList<Book> li = new ArrayList<>();

        li.add(new Book(01, "Gitanjali", "Rabindranath Tagore"));
        li.add(new Book(02, "The Guide", "R. K. Narayan"));
        li.add(new Book(03, "Animal Farm", "George Orwell"));
        li.add(new Book(04, "Alice in Wonderland", "Lewis Carroll"));

        for (Book b : li) {
            System.out.println(b);
        }
    }
}
