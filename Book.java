public class Book {
    
    String title;
    String author;
    String isbn;
    boolean bookAvailable = true;

    public Book(String title, String author, String isbn)
    {

        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // public get

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean GetBookAvailable() {
        return bookAvailable;
    }

   // public get


    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public void setAvailable(boolean available)
    {
        bookAvailable = available;
    }


    public void printBookInfo(){

        System.out.println("Title: " + title + ", " + "Author: " + author +", " + "ISBN: " + isbn + ", " + "Available: " + GetBookAvailable());


    }

}
