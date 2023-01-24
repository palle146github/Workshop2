package com.bridgelabz.workshop2;
import java.util.*;

public class Company {
    Employee employee = new Employee();
    Map<String, employee> company = new HashMap<>();

    public void addEmployee(){

        Scanner s =new Scanner(System.in);
        System.out.println("Enter company name");
        String companyName = s.nextLine();

        System.out.println("Enter  name");
        String name = s.nextLine();

        System.out.println("Enter age");
        String age = s.nextLine();

        System.out.println("Enter Phone number");
        String phoneNumber = s.nextLine();

        System.out.println("Enter City");
        String city = s.nextLine();

        System.out.println("Enter State");
        String state = s.nextLine();

        System.out.println("Enter Department");
        String department = s.nextLine();

        Employee employee = new Employee(name, age, phoneNumber, city, state, department);

        company.put(companyName, employee);
    }
    
    public void displyaDetails(){
        for(Map.Entry m : company.entrySet()){
            System.out.println("Company and employee details"+ m.getKey() + " "+m.getValue());
        }
    }

}
