


package Library;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.concurrent.atomic.AtomicBoolean;
import student.student;

/**
 *
 * @author Burak
 */
public class Book {
 
      private String ID;  
  private String authorName;
  private String authorSurname;
  private String nameOfBook;
  private String genre;
  private static ArrayList<student> waitlist=new ArrayList();
    
  private int queueSize=0;//number of elements in my queue
    private int front=-1;//index of the front element
    private int back=-1; //index of the back element
   

    public Book(String ID, String authorName, String authorSurname, String nameOfBook, String genre,boolean initialValue) {
        this.ID = ID;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.nameOfBook = nameOfBook;
        this.genre = genre;
       
        
    }
     
 public ArrayList<student> getList(Book book){

    return waitlist;}  

   
    public boolean Enqueue(student newStudent) {    
        
          if (front==-1){
            front++; // bu sadece ilk kez girdiğinde yapılıyor. yani sıfırı tutmak için
        }        
        back++;
        waitlist.add(newStudent);
        queueSize++;
        return true;
        
    }


    public student Dequeue() {
          //checks if queue is empty (works for both approaches)
        if(queueSize==0){
            return null;            
        }
        
        //approach 1
        if(queueSize==1){
    //        student elementReturn = waitlist.get(front);
            waitlist.remove(front);
            front--;
            back--;
            queueSize--;
            return waitlist.get(front);
        }
        waitlist.remove(front);
      //  student elementReturn = waitlist.get(front);
        back--;
        queueSize--;
        return waitlist.get(front);

    }


    public student First() {
        if(queueSize == 0){
            return null;
        }
        return waitlist.get(0);
        
    }

    public int size() {
        return queueSize;
    }

    public boolean isEmpty() {
        if (queueSize == 0){
            return true;
        }
        return false;        
    }

    public String toStringList(){
        String toReturn = "[ ";
        
        for(student s: waitlist){
            toReturn += s+ ", ";
                       
        }
        toReturn += " ]";
        
        return toReturn;
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
    

    

