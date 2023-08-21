/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.superclasssubclass;

/**
 *
 * @author Sonia
 */
public class SuperclassSubclass {  //Main Class

    public static void main(String[] args) {  //Main Method
        ainin call = new student();  //Create Object
        call.test();  //Calling 
    }
    static class ainin {  //Super Class
        public void test () {
            System.out.println("I am your Java TTO");
        }
    }
    static class student extends ainin {  //Sub Class
        public void test() {
            super.test();
            System.out.println("I am the class rep Miss!");
        }
    }
}
