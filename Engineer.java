/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office_hw;

/**
 *
 * @author Jesss
 */
public class Engineer extends Employee {
    //Child class from Employee class using the instruction "extends"

    //CONSTRUCTOR
    public Engineer(String firstname, String surname, String PPSN, int ID) {
        super(firstname, surname, PPSN, ID); // Calling super class Employee method      
        wallet = 150;   //150 is the special bonus
    }
    
    //Override
    @Override   // Calls the parent method Work  
    public void Work () {
        System.out.println( this.firstname + " is an Engineer workin now");
    }
     
}
