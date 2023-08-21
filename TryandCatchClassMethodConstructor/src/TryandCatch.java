/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sonia
 */
import java.util.Scanner;

public class TryandCatch {  //Superclass
    public void hibye(){  //Method
        System.out.println("I am cute yet pretty!");
    }  
}
class Name extends TryandCatch {  //Subclass
    public void display (){  //Method
        System.out.println("My name is Sonia");
    }
}
class Main {  //Main Class

    public Main(){  //Constructor
        Name pink = new Name();  //Create Object of Subclass
        pink.display();  //Access field Superclass
        pink.hibye();  //Call Method Superclass
    
}
    public static void main(String[] args) {  //Main Class
       Scanner in = new Scanner (System.in );
      int password ;
      String Username ;   
      
      try{
        System.out.println("Enter your username and Password ");
        Username = in.nextLine();
        password = in.nextInt();
          
          if (Username.equals("Sonia") && password == 1234 ){
            Main hi = new Main();  //Calling Constructor 
          }else{
              System.out.println("Error");
          }
           
          
      }catch(Exception e){
          System.out.println("Error");
    }

        
    }
}