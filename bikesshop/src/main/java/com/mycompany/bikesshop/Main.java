/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bikesshop;

import java.util.Scanner;
/**
 *
 * @author Bunty
 */
public class Main {
    public static void main(String[] args) {
        Bikesshop.Bike bike1 = new Bikesshop.Bike("001", "Mountain Bike", "Red");
        Bikesshop.Bike bike2 = new Bikesshop.Bike("002", "Road Bike", "Blue");
        Bikesshop.Bike bike3 = new Bikesshop.Bike("003", "Hybrid Bike", "Green");
        Bikesshop.Bike bike4 = new Bikesshop.Bike("004", "Electric Bike", "Yellow");
        Bikesshop.Bike bike5 = new Bikesshop.Bike("005", "Folding Bike", "Black");
        Bikesshop.Bike bike6 = new Bikesshop.Bike("006", "BMX Bike", "White");
        Bikesshop.Bike bike7 = new Bikesshop.Bike("007", "Cruiser Bike", "Pink");
        Bikesshop.Bike bike8 = new Bikesshop.Bike("008", "Kids Bike", "Purple");
        Bikesshop.Bike bike9 = new Bikesshop.Bike("009", "Touring Bike", "Orange");
        Bikesshop.Bike bike10 = new Bikesshop.Bike("010", "Recumbent Bike", "Brown");
        Bikesshop.Bike bike11 = new Bikesshop.Bike("011", "Fat Bike", "Gray");
        Bikesshop.Bike bike12 = new Bikesshop.Bike("012", "Tandem Bike", "Silver");
        Bikesshop.Bike bike13 = new Bikesshop.Bike("013", "Track Bike", "Gold");
        Bikesshop.Bike bike14 = new Bikesshop.Bike("014", "Fixed Gear Bike", "Copper");
        Bikesshop.Bike bike15 = new Bikesshop.Bike("015", "Single Speed Bike", "Bronze");
        Bikesshop.Bike bike16 = new Bikesshop.Bike("016", "Cyclocross Bike", "Maroon");
        Bikesshop.Bike bike17 = new Bikesshop.Bike("017", "Gravel Bike", "Teal");
        Bikesshop.Bike bike18 = new Bikesshop.Bike("018", "Triathlon Bike", "Cyan");
        Bikesshop.Bike bike19 = new Bikesshop.Bike("019", "Cargo Bike", "Magenta");
        Bikesshop.Bike bike20 = new Bikesshop.Bike("020", "Dirt Jump Bike", "Lime");

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Bike Shop!");
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Rent a Bike");
            System.out.println("2. Return a Bike");
            System.out.println("3. View Bike Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            System.out.print("Enter your Bike - Id : ");
            String bikeid = scanner.nextLine();
            
            Bikesshop.Bike selectedbike = getBikebyId(bikeid,bike1,bike2,bike3,bike4,bike5,bike6,bike7,bike8,bike9,bike10,bike11,bike12,bike13,bike14,bike15,bike16,bike17,bike18,bike19,bike20);
            
            if(selectedbike == null){
               System.out.println("Bike ID not found. Please try again.");
                continue; 
            }
            switch (choice) {
                case 1 -> selectedbike.rentBike();
                case 2 -> selectedbike.returnBike();
                case 3 -> System.out.println(selectedbike);
                case 4 -> {
                    System.out.println("Thank you for visiting the Bike Shop!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
    
    private static Bikesshop.Bike getBikebyId(String bikeid,Bikesshop.Bike...bikes){
        for(Bikesshop.Bike bike : bikes){
            if(bike.getId().equals(bikeid)){
                return bike;
            }
        }
    return null;
            
    }
}