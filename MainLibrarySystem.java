import java.util.ArrayList;
import java.util.Scanner;

public class MainLibrarySystem {

    public static void main(String... arg){

        Book[] books = new Book[10];
        // User[] users = new User[2];
        ArrayList<User> users = new ArrayList();
        Library Lib = new Library();
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\\n");

        String[] titles= {"Harry Potter", "Maze Runner", "Wimpy Kids", "Hunger Games"};
        String[] authors= {"JK Rowling", "James Dashner", "Jeff Kinney", "Suzanne Collins"};
        String[] Isbn = {"192749", "309273", "810222", "128742"};

        for (int i = 0; i < titles.length; i++) {
            books[i] = new Book(titles[i], authors[i], Isbn[i]);
            Lib.addBook(books[i]);  // Add books to the library's list
        }



        for (int s=0;s<2;s++){

            User user = new User();

            System.out.print("Name: ");
            user.setName(scan.next());
            System.out.print("Age: ");
            user.setAge(scan.nextInt());

            users.add(user);


        }

       System.out.println("--Available books--");
        for(int a=0;a<titles.length;a++){
            books[a].printBookInfo();

        }

        for(int b=0;b<2;b++){

            System.out.print("Books to borrow by " + users.get(b).getName() + ":");
            String bookToBorrow = scan.next();

            users.borrowBook(bookToBorrow);

            Lib.borrowBook(users(b), bookToBorrow);

        }


        System.out.println("--Available books after borrow--");
        for(int a=0;a<titles.length;a++){
            books[a].printBookInfo();

        }


        System.out.println("--Books borrowed--");

        for(User user: users){
            user.printBorrowedBooks();
        }

        System.out.println("--Overdue Books--");
        for(User user: users){
            user.checkDueDates();
        }


    }

}