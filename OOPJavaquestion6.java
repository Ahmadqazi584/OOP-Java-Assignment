package com.company;
import java.util.Scanner;

/* Define a class Students containing id, name as instance members and two
methods named getStudent() and displayStudent() as instance
methods. Now create a class named Exam which is inherited from Student. The
derived class contains the mark secured in three subjects’ sub1, sub2, sub3.
The derived class also contains getMark() and showMark() as instance
members. Now create an array of objects of the Exam class and input the data
and display the Mark Sheet of the all the Students.   */
class Students{
    private int id;
    private String name;
    public void getStudent(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void displayStudents(){
        System.out.println("ID \t\t\t : " + " " + id);
        System.out.println("Name \t\t : " + " " + name);
    }
}
class Exam extends Students{
    private byte sub1;
    private byte sub2;
    private byte sub3;
    public void getMark(byte sub1, byte sub2, byte sub3){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    public void showMarks(){
        System.out.println("Sub 1 \t\t : " + " " + sub1);
        System.out.println("Sub 2 \t\t : " + " " + sub2);
        System.out.println("Sub 3 \t\t : " + " " + sub3);
    }
}
public class OOPJavaquestion6 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Students : ");
        Exam [] exam = new Exam [input.nextByte()];
        for (int i = 0; i < exam.length; i++) {
            exam[i] = new Exam();
            System.out.println("Enter student id & name : ");
            exam[i].getStudent(input.nextInt(), input.next());
            System.out.println("Enter the student sub1, sub2 & sub3 marks : ");
            exam[i].getMark(input.nextByte(), input.nextByte(), input.nextByte());
        }
            System.out.println("\t===============");
            System.out.println("\t Details are : ");
            System.out.println("\t===============");
        for (int i = 0; i < exam.length; i++) {

            System.out.println("Student : " + (i+1));
            exam[i].displayStudents();
            exam[i].showMarks();
            System.out.println("--------------------");
        }

    }
}
