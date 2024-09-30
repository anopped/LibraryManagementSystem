import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class User 
{
    private int age;
    private String name;
    // private String borrowedBooks;
    private String bookTitle;
    private ArrayList<String>borrowedBooks = new ArrayList<>();
    private ArrayList<LocalDate> dates = new ArrayList<>();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMMM-yyyy ");
    LocalDate now = LocalDate.now();
    String dateNow = format.format(now);
    LocalDate dueDate = LocalDate.now().plusDays(14);
    String dateForDue = format.format(dueDate);
    Period endBorrow = Period.between(now,dueDate);

    public User(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // public get

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public ArrayList<String> getBorrowedBook()
    {
        return borrowedBooks;
    }

    // public set

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setBorrowedBook(ArrayList<String>borrowedBooks)
    {
        this.borrowedBooks = borrowedBooks;
    }

    
    // constructor


    public void borrowBook(String bookTitle)
    {
        borrowedBooks.add(bookTitle);
    }

    public void returnBook(String bookTitle)
    {
        borrowedBooks.remove(bookTitle);
    }


    public void printBorrowedBooks()
    {

        System.out.print("User: " + name + ", " );
        System.out.println("Borrowed: " + String.join(", ", borrowedBooks));

    }

    public void checkDueDates()
    {
        LocalDate dueDate = LocalDate.now().plusDays(14);
        String dateForDue = format.format(dueDate);
        Period endBorrow = Period.between(now,dueDate);

        System.out.print("User: " + name +", ");
        System.out.print("Books: " +String.join(", ", borrowedBooks) + ", ");
        System.out.println("Overdue by "+endBorrow+ " days");
    }
}
