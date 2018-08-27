/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import java.util.Scanner;

/**
 *
 * @author muttalibmoos
 */
public class Animal 
{
    private String zooName;
    private String zooLocation; 
    
    public Animal(String zooName, String zooLocation)
    {
      this.zooName = zooName;   
      this.zooLocation = zooLocation; 
      
    }
    
    public String getZooName()
    {
        return this.zooName; 
    }
    
    public String getZooLocation() 
    {
        return this.zooLocation; 
    }
    
  
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);
      
      String zooName, zooLocation, animalName; 
      double age; 
      
      System.out.println("please enter the name of the zoo ");
      zooName = input.next();
      
       System.out.println("please enter the location of the zoo ");
       zooLocation = input.next();
       
        System.out.println("please enter the name of the animal ");
        animalName = input.next();
        
         System.out.println("plese enter the animals age ");
         age = input.nextDouble();
         
         Dog zoo = new Dog(zooName, zooLocation, animalName, age);
         
         zoo.show();
      
        
    }
}
    class Dog extends Animal
    {
        String animalName; 
        double age; 
        
       public Dog(String zooName,String zooLocation,  String animalName, double age)
               {
                   super(zooName,zooLocation); 
                   this.animalName = animalName; 
                   this.age = age;  
                   
               }
                   
       public void show()
       {
           System.out.println(" the zoo name is: " +super.getZooName());
           System.out.println(" the zoo location is: " +super.getZooLocation());
           System.out.println(" the animal name is: " +this.animalName);
           System.out.println(" the animal age is: " +this.age);
       }
        
    }

