import java.util.ArrayList;

public class Library {
    
    private ArrayList<Book> library = new ArrayList<>();
    Book books = new Book(null,null,null);


    public void addBook(Book book)
    {

        library.add(book);
    }

    public void searchByTitle(String title)
    {

        library.contains("Harry Potter");
        library.contains("Maze Runner");
        library.contains("Wimpy Kids");
        library.contains("Hunger Games");

        System.out.println(library);

    }

    public void borrowBook(User user, String title){

        for (Book book : library) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.GetBookAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book '" + title + "' borrowed successfully.");
                }
                else {
                    user.returnBook(title);
                    System.out.println("Sorry, the book '" + title + "' is not available.");
                }
                return;
            }
        }
        System.out.println("Sorry, the book '" + title + "' is not available in the library.");
    }
}
