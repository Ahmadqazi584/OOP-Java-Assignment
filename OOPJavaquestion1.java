package com.company;
import java.util.Scanner;
 /* Define a class named Customer with instance members as id and name and
        input the data using getDetails() and display them using showDetails(). */
class Customer{
    int id;
    String name;
    Scanner input = new Scanner(System.in);
     public void getDetails() {
         System.out.println("Enter id and name : ");
         id = input.nextInt();
         name = input.next();
     }
     public void showDetails(){
         System.out.println();
         System.out.println("Id : " + id);
         System.out.println("Name : " + name);
         System.out.println();
     }
 }
public class OOPJavaquestion1 {
    public static void main(String[] args){
        Customer c = new Customer();
        c.getDetails();
        c.showDetails();
    }
}
