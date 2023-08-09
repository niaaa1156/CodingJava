/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taskjava1;
import java.util.Scanner;

/**
 *
 * @author Sonia
 */
public class TaskJava1 {

    static Scanner in = new Scanner (System.in);

    public static void main(String[] args) {
        
        String[]Movie={"Barbie","Boboiboy","Upin dan Ipin"};
 
        int[]price={15, 18, 16};
        
        try{
        System.out.println("Please enter the movie\n 1. Barbie\n 2. Bboiboy \n 3. Upin dan Ipin");
        
        int choices = in.nextInt();
        choices--;
        
        System.out.println("Movie: " + Movie[choices] + "\nPrice: RM" + price[choices]);}
        
        catch(Exception io){
            System.out.println("Please enter the listed Movies!");
        }
    }
}
