/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loan;

import Library.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import student.student;

/**
 *
 * @author Burak
 */
public class BookWaitList {
   
    private Book book;
    private static ArrayList<student> waitlist;
    private int queueSize;//number of elements in my queue
    private int front;//index of the front element
    private int back; //index of the back element
    
      public BookWaitList(Book book){
        this.book=book;
        this.waitlist= new ArrayList();
        this.queueSize=0;
        this.front=-1;
        this.back=-1;        
    }
      
      
    public ArrayList<student> getList(Book book){

    return waitlist;}  

   
    public boolean Enqueue(student newStudent) {    
        
          if (front==-1){
            front++; // bu sadece ilk kez girdiğinde yapılıyor. yani sıfırı tutmak için
        }        
        back++;
        waitlist.add(back, newStudent);
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

    public String toString(){
        String toReturn = "[ ";
        
        for(student s: waitlist){
            toReturn += s+ ", ";
                       
        }
        toReturn += " ]";
        
        return toReturn;
    }
    




}


