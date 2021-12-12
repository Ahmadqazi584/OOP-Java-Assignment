package com.company;

import java.awt.*;
import java.awt.desktop.AboutEvent;
import java.util.Scanner;

/*  Define a class Employee input the id, name and basic of 5 employees and
    display their salary slip based on the following condition. Use the proper
    constructor and methods. */
/*
Basic >= $5000 and < $10000
   DA: 40% of basic
   HRA: 20% of basic
   PF : 10% of basic
Basic >= $3000 and <$5000
   DA: 30% of basic
   HRA: 20% of basic
   PF: 10% of basic
Basic < $3000
   DA: 20% of basic
   HRA: 10% of basic
   PF: 10% of basic
Basic >= $10000
   DA: 50% of basic
   HRA: 30% of basic
   PF: 10% of basic
*/
class Employee{
    // Properties of employees
    int id;
    String name;
    float basic;
    float DA, HRA, PF;
    float Net_Salary;

    // Constructor that get input of id, name & basic
    Employee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id, name and basic : " );
        id = sc.nextInt();
        name = sc.next();
        basic = sc.nextInt();
    }

    // DA Method for different values of basic
    public float infoDA(){
        if (basic >= 5000 && basic < 10000){
            DA = basic/100 * 40;
        }else if (basic >= 3000 && basic < 5000){
            DA = basic/100 * 30;
        }else if (basic < 3000){
            DA = basic/100 * 20;
        }else if(basic >= 10000){
            DA = basic/100 * 50;
        }else {
            DA = 0;
        }
        return DA;
    }
    // HRA Method for different values of basic
    public float infoHRA(){
        if (basic >= 5000 && basic < 10000){
            HRA = basic/100 * 20;
        }else if (basic >= 3000 && basic < 5000){
            HRA = basic/100 * 20;
        }else if (basic < 3000){
            HRA = basic/100 * 10;
        }else if(basic >= 10000){
            HRA = basic/100 * 30;
        }else {
            HRA = 0;
        }
        return HRA;
    }
    // PF Method for different values of basic
    public float infoPF(){
        if (basic >= 5000 && basic < 10000){
            PF = basic/100 * 10;
        }else if (basic >= 3000 && basic < 5000){
            PF = basic/100 * 10;
        }else if (basic < 3000){
            PF = basic/100 * 10;
        }else if(basic >= 10000){
            PF = basic/100 * 10;
        }else {
            PF = 0;
        }
        return PF;
    }
    // Method for net salary by basic + DA + HRA - PF
    public float netSalary(){
        Net_Salary = (basic + infoDA() + infoHRA()) - infoPF();
        return Net_Salary;
    }
    // The method used to generated slip of the above data entered
    public void getInfo(){
        System.out.println("\t\t\t\tAAAAAA  Pvt. Ltd.");
        System.out.println("=======================================================");
        System.out.println("ID \t\t\t : " + id);
        System.out.println("Name \t\t : " + name);
        System.out.println("Basic \t\t : " + basic);
        System.out.println("DA(+) \t\t : " + infoDA());
        System.out.println("HRA(+) \t\t : " + infoHRA());
        System.out.println("PF(-) \t\t : " + infoPF());
        System.out.println("-----------------------------------");
        System.out.println("Net Salary \t : " + netSalary());
        System.out.println("=======================================================");

    }

}
public class OOPJavaquestion4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // involvement of total employees
        System.out.print("Enter the employees : ");
        int size = input.nextByte();
        Employee [] e = new Employee [size];

        // loop for input
        for (int i = 0; i < e.length; i++) {
            e[i] = new Employee();
        }

        // heading message
        System.out.println("\t\t+++++++++++++++++++++++++++++++++++");
        System.out.println("\t\t SALARY STATEMENT OF THE EMPLOYEES");
        System.out.println("\t\t+++++++++++++++++++++++++++++++++++");

        // output slip data for Employees
        for (int i = 0; i < e.length; i++) {
            e[i].getInfo();
        }
     }
}
