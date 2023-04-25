
package Library;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 *
 * @author Burak
 */
public class Book {
    private static Book instance;
      private String ID;  
  private String authorName;
  private String authorSurname;
  private String nameOfBook;
  private String genre;
 private final AtomicBoolean myAtomicBoolean;

    

   

    public Book(String ID, String authorName, String authorSurname, String nameOfBook, String genre,boolean initialValue) {
        this.ID = ID;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.nameOfBook = nameOfBook;
        this.genre = genre;
         myAtomicBoolean = new AtomicBoolean(initialValue);
      
    }
     public boolean isMyAtomicBoolean() {
        return myAtomicBoolean.get();
    }

    public void setMyAtomicBoolean(boolean newValue) {
        myAtomicBoolean.set(newValue);
    }

public static Book getInstance(String ID, String authorName, String authorSurname, String nameOfBook, String genre, boolean initialValue) {
        if (instance == null) {
            instance = new Book(ID, authorName, authorSurname, nameOfBook, genre, initialValue);
        }
        return instance;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


  
  public String toString() {
		
		return "\n******\nBook ID:" + this.ID+"\nBook name:" + this.nameOfBook+"\nauthor name:" + this.authorName+ " " +this.authorSurname.toString();
	}
  

    // diğer kodlar burada
    
 
  
   

}
    

    

