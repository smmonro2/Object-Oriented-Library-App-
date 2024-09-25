//Serena Monroe CIS340 Online A7
//import java.util.ArrayList;
import java.util.Scanner;

public class Book {
	private String title;
    private int publicationYear;

// Constructor
public Book(String title, int publicationYear) 
{
    this.title = title;
    setPublicationYear(publicationYear); 
}

    // Getter for Title
    public String getTitle() 
    {
        return title;
    }

    // Setter for publicationYear 
    public void setPublicationYear(int publicationYear)
    {
        if (publicationYear >= 1000 && publicationYear <= 2022)
        {
            this.publicationYear = publicationYear;
        } 
        else 
        {
            // Default to 1900
            this.publicationYear = 1900;
        }
    }

    // Getter for publicationYear
    public int getPublicationYear() 
    {
        return publicationYear;
    }
}

