package com.sathya.main;


import com.pack1.A.Animal;
import com.pack1.B.Cat;
import com.pack1.B.Dog;
import com.pack1.C.Lion;
import com.pack1.D.Mouse;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	System.out.println("hi");
    	
       Animal ani=new Dog();
       ani.run();
       
       Animal ani1=new Cat();
       ani1.run();
       
       
       Animal ani2=new Lion();
       ani2.run();
       
       Animal ani3=new Mouse();
       ani3.run();
    }
}
