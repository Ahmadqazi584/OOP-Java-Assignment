package com.company;
import java.util.Scanner;
/* Rewrite the above program (OOPJavapractice3) to input the details of 5 customers using appropriate
        constructor and display them using showDetails() method. */
class anothercustomer{
    int id;
    String name;
    Scanner input = new Scanner(System.in);
    public anothercustomer() {
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
public class OOPJavaquestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of customers : ");
        int n = sc.nextByte();
        anothercustomer [] cus = new anothercustomer[n];
        for (int i = 0; i < cus.length; i++) {
            cus[i] = new anothercustomer();
        }
        System.out.println();
        System.out.println("================================ ");
        System.out.println("Enter the details of " + n + " customers ");
        System.out.println("================================ ");

        for (int i = 0; i < n; i++) {
            cus[i].showDetails();
        }
    }
}