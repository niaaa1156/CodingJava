/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sonia
 */
public class Sonia {  //Superclass
    public void hibye(){  //Method
        System.out.println("I am cute yet pretty!");
    }  
}
class Name extends Sonia {  //Subclass
    public void display (){  //Method
        System.out.println("My name is Sonia");
    }
}
class Main {
    public static void main(String[] args) {  //Main Class
        
        Name pink = new Name();  //Create Object of Subclass
        pink.display();  //Access field Superclass
        pink.hibye();  //Call Method Superclass
    }
}
