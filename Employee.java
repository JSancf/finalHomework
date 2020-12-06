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
public class Employee {
    
    //Properties
    protected String firstname, surname, PPSN;
    private int ID;
    protected double wallet;
    
    //Constructor
    public Employee (String firstname, String surname, String PPSN, int ID) {
        this.firstname = firstname;
        this.surname = surname;
        this.PPSN = PPSN;
        this.ID = ID;
        
        this.wallet = 0;   //The value is 0, no need to declare
    }
    
    // Method Work
    public void Work () { 
        System.out.println( this.firstname + " is working now");
    }
    
    //Method wallet
    public void Payday (int money){ 
        this.wallet += money; //Add the money to the wallet
    }
    
}
