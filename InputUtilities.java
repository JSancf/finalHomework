/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package office_hw;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Jesss
 */
public class InputUtilities {
     /*
     * Displays a prompt and requests text from  user; if no text is entered
     * displays error message and ask again
     * @param prompt - message made to user
     * @return - text entered by the user
     
    */
    
    public static String getUserText (String prompt) {
        
        BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in));
        String input;
        
        do{ 
            //When the input is not test, ask again
            
            System.out.println(prompt); 
            
            //prompt as an output
            
            try{
                
               input = myKB.readLine(); 
               
                //read input
            }
            
            catch(Exception e){
                
                System.out.println("Invalid Input, an error has ocurred");
                input = ""; 
                
                //set it to nothinig if invalid
            }
            
        } while (!input.matches("[a-zA-Z]+"));
        
        //userInput must be text only
        
        return input;
    }
    
    /*
     * Displays a prompt and requests an integer from  user; if a non-integer is entered
     * displays error message and ask again
     * @param prompt - message made to user
     * @param min - minimum valid value 
     * @param max - maximum valid value
     * @return - valid integer entered by the user
     */
    
    public static int getUserInt(String prompt, int min, int max){
        
          BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in));
           
          int userInput=0;
          boolean valid = false; 
          
          do{
             //prompt for user input - error if not integer and ask again
             
               System.out.println(prompt); 
                //prompt as an output
                
               System.out.println("You must enter a value between " + min + " and " + max );
               
            try{
                userInput = Integer.parseInt(myKB.readLine()); 
                //reading input
                
                valid = true;
            }
            
            catch(Exception e){
                
                System.out.println("That is not a valid number. Please try again");
                //valid stays false
            }
            
            
        }while ( (!valid) || (userInput < min) || (userInput > max));
          //wont be valid if < min or > max
           
           return userInput;
           //valid and in the range
    }
    
     /**
     * 
     * Displays a prompt and requests a decimal from  user; if a non-decimal is entered
     * display error message and ask again
     * 
     * @param prompt - message displayed
     * @param minValue - minimum value that is allowed
     * @param maxValue - max value that is allowed
     * @return -- a valid decimal input by user
     */
    public static double getUserDouble(String prompt, int minValue, int maxValue){
        
       
          BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in));
           double userInput=0;
           boolean valid = false;
           
           do{
                //prompt user for a decimal - if not decimal - output error and ask again
               System.out.println(prompt); //output prompt
               System.out.println("You must enter a value between " + minValue + " and " + maxValue );
               
            try{
                userInput = Double.parseDouble(myKB.readLine()); //read input
                valid = true;
            }
            catch(Exception e){
                
                System.out.println("That is not a number. Please try again");
                //valid stays false
            }
            
        }while ( (!valid) || (userInput < minValue) || (userInput > maxValue));
           
           //must be valid and within the range
           return userInput;
           
    }
    
}
