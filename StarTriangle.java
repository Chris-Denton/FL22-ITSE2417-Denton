/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Chris Denton
 * 12/6/2022
 * This program prints a triangle of a size determined by the user
 */

public class StarTriangle implements FinalProject{
    
    public StarTriangle(){
        
    }
    
    public void begin(){
                
        int size; //size of the triangle
        
        System.out.println("Welcome to the Triangle Maker!");
        System.out.println();
        
        System.out.print("Enter the size of the triangle (must be between 2-10): ");
        try
        {
            size = Itse2417Main.myScan.nextInt(); //user input

            if(size >= 2 && size <= 10) //checks for valid size
            {
                for(int x = 1; x <= size; x++){ //a for loop for each line
                    for(int s = 0; s < size - x; s++){ //a for loop to make sure the the spaces make the triangle symetrical
                        System.out.print(" ");
                    }
                    System.out.println(printStars(x)); //calls on a function to make the stars
                }
                java.util.concurrent.TimeUnit.SECONDS.sleep(2);  //pauses program for 2 seconds
            }
            else
            {
                throw new NumberFormatException();
            }
        }
        catch(InterruptedException e) 
        {}
        catch(NumberFormatException e) //error for bad input
        {
            System.out.println("Not a valid size");
            try
            {
                java.util.concurrent.TimeUnit.SECONDS.sleep(2);  //pauses program for 2 seconds 
            }
            catch(InterruptedException f) 
            {}
        }       
        
        System.out.println("\n");
        
    }    
    
    public String printStars(int num){ //returns a line of stars of size (num * 2) - 1
        if(num > 1){ //if number is greater than 0, then it returns a star on each side of another function call
            return "*" + printStars(num - 1) + "*";
        }else{ //if num is 1 then it returns one star
            return "*";
        }
    }
    
}
