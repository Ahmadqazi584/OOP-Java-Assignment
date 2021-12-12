package com.company;
import java.util.Scanner;
/*  Define a class Student and create instance members as id, name and age.
        Define id as static where the id will start with 1001 and the next id will be
        updated as 1002 and so on. Create five objects of students and display them. */
class Student {
    static int id;
    String name;
    byte age;
   }

public class OOPJavaquestion5 extends Student{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Student [] arr = new Student[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the customer details : " );
            id = i;
            arr[i].name = input.next();
            arr[i].age = input.nextByte();
        }
    }
}
