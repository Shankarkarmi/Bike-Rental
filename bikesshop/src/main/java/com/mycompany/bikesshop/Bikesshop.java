/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bikesshop;

/**
 *
 * @author Bunty
 */
public class Bikesshop {
    public static class Bike{
        private String id;
        private String model;
        private String color;
        private boolean isAvailable;
        
        public Bike(String id,String model,String color){
            this.id=id;
            this.model=model;
            this.color=color;
            this.isAvailable=true;
        }
        public String getId(){
            return id;
        }
        public void setId(String id){
            this.id=id;
        } 
        public String getColor(){
            return color;
        }
        public void setColor(String id){
            this.id=color;
        }
        public String getModel(){
            return model;
        }
        public void setModel(String id){
            this.id=model;
        }
        public void setIsAvailable(boolean isAvailable){
            this.isAvailable=isAvailable;
        }
        public void returnBike(){
            this.isAvailable=true;
            System.out.println("Bike has been return.");
        }
        public void rentBike(){
            if(isAvailable){
                this.isAvailable=false;
                System.out.println("Bike"+id+" has been rented.");
            }
            else{
                System.out.println("Bike"+id+" is not available.");
            }
        }
        @Override
        public String toString(){
            return "Bike{ id= "+id+" ,model= "+model+" ,color= "+color+" ,isAvailable "+isAvailable+" ,}";
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Bike bike = new Bike("123", "Mountain Bike", "Red");
        System.out.println("Hello World!");
        bike.getId();// will not generate ooutput 
        
        System.out.println(bike.toString());
        System.out.println(bike);
        
        bike.rentBike();
        System.out.println(bike);
        
        bike.returnBike();
        System.out.println(bike);
        
    }
}
