package com.company;
import java.util.Scanner;
//2. Rewrite the above (OOPJavaquestion1 file) program to input and display the details of 5 customers.
class Newcustomer{
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
public class OOPJavaquestion2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of customers : ");
        int n = sc.nextByte();
        Newcustomer [] c = new Newcustomer [n];

        for (int i = 0; i < c.length; i++) {
            c[i] = new Newcustomer();
            c[i].getDetails();
        }
        System.out.println();
        System.out.println("================================ ");
        System.out.println("Enter the details of " + n + " customers ");
        System.out.println("================================ ");
        for (int i = 0; i < c.length; i++) {
            c[i].showDetails();
        }
    }
}

