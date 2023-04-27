/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loan;

import java.util.Scanner;

/**
 *
 * @author Burak
 */
public class LoanUtility {
    
    public boolean optionWiser(){
    Scanner scan=new Scanner(System.in);
     boolean valid1=false;
     boolean getInQueue=false;
                    while(!valid1){  
          
                       System.out.println("If you want to get in the queue press 1 , if you dont press 2 to go exit please");
                       try{
                  int   myInput=scan.nextInt();
              switch(myInput){
           case 1:
                 System.out.println();
                 getInQueue=true;
                 valid1=true;
               break;
                case 2:
                    System.out.println("---------------EXIT------------------");
                valid1=true;
               break;
               
                  default:
                    System.out.println("Please enter only 1 or 2");
                    scan.nextInt();
                    break;
                    
                     }
          }  
             catch(Exception e){
             
             System.out.println("Please enter only numbers");
              scan.nextLine();
              
             }}
    return getInQueue;
} }
