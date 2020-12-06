/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office_hw;


import java.util.ArrayList;


/**
 *
 * @author Jesss
 */
public class Office_hw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Ask the user for information about each Employee
        
        int ID = 1; //Starts in 1
        
        //List of all employees
        ArrayList <Employee> staffList = new ArrayList <Employee> ();
        
        //Asks for information of each staff member
        for (int i=0; i<5; i++) {
            String fname = InputUtilities.getUserText("Please enter your first name: ");
            String sname = InputUtilities.getUserText("Please enter your surname: ");
            String PPSN = InputUtilities.getUserText("Please enter your PPS Number: ");
            
            //Creates a new member in the array
            Employee staffMember = new Employee (fname, sname,PPSN,ID);
            
            staffList.add(staffMember);
            ID++;   // Adds 1 to get the next ID staff memeber and avoid repetition, incrementing.
        }
        
        //loop through entire array using object
        for (Employee e: staffList) {
            
            //Calling method Work
            e.Work(); 
            
            //Calling method Payday
            e.Payday(ID);
        }
         
    }
    
}


