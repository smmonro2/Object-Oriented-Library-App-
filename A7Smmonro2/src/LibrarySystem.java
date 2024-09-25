//Serena Monroe CIS340 Online A7
import java.util.Scanner;
import java.util.ArrayList;

public class LibrarySystem {
	private ArrayList<Book> books = new ArrayList<>();

// Display header
public void displayHeader() {
    System.out.println("\t\tNew Library System");
    System.out.println();
    }

// Add a book to the library
public void addBook() 
{
	Scanner scnr = new Scanner(System.in);
    System.out.print("Enter Book title: ");
    String title = scnr.nextLine();
    System.out.print("Enter Book Year: ");
    int year = scnr.nextInt();
    scnr.nextLine(); 
    Book book = new Book(title, year);
    books.add(book);
    System.out.println("Title '" + title + "' added to the library.");
}
 // Display the list of books
public void displayBookList()
{
    System.out.printf("%-50s%-4s%n", "Title", "Year");
    for (Book book : books) {
    System.out.printf("%-50s%-4d%n", book.getTitle(), book.getPublicationYear());
}
    }

// Load the library system
public void loadLibrarySystem() 
{
	Scanner scnr = new Scanner(System.in);
    displayHeader();
    System.out.print("How many new books do you want to add to the Library? ");
int numBooks = scnr.nextInt();
scnr.nextLine(); 

for (int i = 0; i < numBooks; i++) 
{
    addBook();
}

    System.out.println("Adding books complete. Press enter to continue.");
    scnr.nextLine(); 

    displayHeader();
    displayBookList();
    }
}

