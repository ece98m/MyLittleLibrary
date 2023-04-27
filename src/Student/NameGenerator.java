/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;



import java.util.Random;

/**
 *
 * @author Burak
 */



/**
 * Generating random names

 * 
 * getRandomName() generates a random full name using these arrays
 
 */
public class NameGenerator {
    
    
public String[] firstNames = {"Hardy", "Kenyon", "Soul", "Lowell", "Michael", "Kevin", "Steffany","Jesse","Hope","Owen","Zack","Oscar","Steve"};
	
	protected String[] surnames = {"Murphy", "Silva", "Smith", "Jones", "Carvalho", "Ernst","Dean","Brown","Honest","Hill","Power","Bean","Beck"};
	
	public NameGenerator() {
		
		//nothing here - deliberate
		
	}
	
        
	public String getRandomName() {
				
		Random r = new Random();
		
		//pick a firstname and surname based on length of array
		String fname = this.firstNames[r.nextInt(firstNames.length)];
		String sname = this.surnames[r.nextInt(surnames.length)];
		
		return ( fname + " " + sname);
		
	}
       
}


