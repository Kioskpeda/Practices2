package org.example;


import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class App {
    public static void main(String[] args) {
        //String Practice - Name.
        String myName = "Alexis";

        System.out.println(myName);
        String firstName = "Alexis";
        String lastName = "Fager";
        String sentence = firstName + " " + lastName;
        System.out.println(sentence);


        // - Decimal Result Practice.


        double d = 2.9;
        double b = 5.8;
        double result = d + b;

        System.out.println(result); }
    }
     class Car {
         String carBrand;
         String ownerName;
         String registration;
         int registrationNumber;
         int maxSpeed;
         String maxSpeed2;

         public String getInformation() {
             return carBrand + " " + ownerName + " " + registration + registrationNumber + maxSpeed + maxSpeed2;
         }

         {


             Car opel = new Car();
             opel.carBrand = "Opel";
             opel.ownerName = "Alexis";
             opel.registration = "FAQ";
             opel.registrationNumber = 919;
             opel.maxSpeed = 200;
             opel.maxSpeed2 = "kmh";
             System.out.println(opel.getInformation());

             //I have absolutely no idea how to get it to print out the information or anything.


         }

     }
















































