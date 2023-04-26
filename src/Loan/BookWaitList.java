/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loan;

import Library.Book;

import java.util.ArrayList;

import student.student;

/**
 *
 * @author Burak
 */
public class BookWaitList {
    private Book book;
    private ArrayList<student> waitlist;
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

 
    public boolean Enqueue(student newStudent) {    
        if (waitlist.isEmpty()){   //ilk öğrenci girdiğinde front 0 olue // her zaman ya sıfır ya da -1 demek empty
            
           waitlist.add(0, newStudent);  
        }        
        back++;  //her öğr girdiğinde bir artar yani son öğrencinin indexini tutar
        int last=waitlist.size()-1;
        waitlist.add(last, newStudent);
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
            student student = waitlist.get(front);
            front--;  //sıra boşaldı hiç index yok
            back--;
            queueSize--;
            return student;
        }
        student student = waitlist.get(front);
        back--;
        queueSize--;
        return student;
    }


    public student First() {
        if(queueSize == 0){
            return null;
        }
        return waitlist.get(0);
        
    }


    public student Last() {
        if(queueSize==0){
            return null;
        }     
        int last=waitlist.size()-1;
        return waitlist.get(last);
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


