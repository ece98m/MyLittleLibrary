



package Loan;

import Library.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import student.student;

public class WaitList {
    private static Map<Book, ArrayList<student>> waitLists = new HashMap<>();
    private Book book;
    
    public WaitList(Book book) {
        this.book = book;
        if (!waitLists.containsKey(book)) {
            waitLists.put(book, new ArrayList<>());
        }
    }
    
    public ArrayList<student> getList() {
        return waitLists.getOrDefault(book, new ArrayList<>());
    }
    
    public boolean enqueue(student newStudent) {
        if (!waitLists.containsKey(book)) {
            waitLists.put(book, new ArrayList<>());
        }
        return waitLists.get(book).add(newStudent);
    }
    
    public student dequeue() {
        ArrayList<student> waitList = waitLists.get(book);
        if (waitList == null || waitList.isEmpty()) {
            return null;
        }
        return waitList.remove(0);
    }
    
    // diğer metodlar
}


































///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Loan;
//
//import Library.Book;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import student.student;
//
///**
// *
// * @author Burak
// */
//    public class WaitList {
//    private static Map<Book, ArrayList<student>> waitLists = new HashMap<>();
//    
//    public WaitList(Book book) {
//        if (!waitLists.containsKey(book)) {
//            waitLists.put(book, new ArrayList<>());
//        }
//    }
//    
//    public ArrayList<student> getList(Book book) {
//        return waitLists.getOrDefault(book, new ArrayList<>());
//    }
//    
//    public boolean enqueue(Book book, student newStudent) {
//        if (!waitLists.containsKey(book)) {
//            waitLists.put(book, new ArrayList<>());
//        }
//        return waitLists.get(book).add(newStudent);
//    }
//    
//    public student dequeue(Book book) {
//        ArrayList<student> waitList = waitLists.get(book);
//        if (waitList == null || waitList.isEmpty()) {
//            return null;
//        }
//        return waitList.remove(0);
//    }
//    
//    // diğer metodlar
//}
//

