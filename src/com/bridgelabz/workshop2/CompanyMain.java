package com.bridgelabz.workshop2;
import java.util.*;

public class CompanyMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Company and Employee Deatails");
        Company company = new Company();
        while (true) {
            System.out.println("1. Add company and employee Details   2. Display company and employee Details");
            int option = s.nextInt();
            switch (option) {
                case 1:
                    compnay.addEmployee();
                    System.out.println("Details are added successfully");
                    break;
                case 2:
                    company.displyaDetails();
                    break;
                default:
                    System.out.println("Invalid option!! Choose right option");
                    break;
            }
        }
    }
}
