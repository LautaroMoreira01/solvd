import classes.*;
import programExceptions.invalidHoursException;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Address companyAddress = new Address(1L , "Argentina", "Buenos aires" , "Bynnon", "123");

        Company company = new Company("Solvd");
        company.setAddress(companyAddress);

        Address bankAddress = new Address(2L , "Monaco", "aires" , "Av12", "321");
        Bank bank = new Bank(1L , "American" , "AM" , bankAddress);
        BankAccount bankAccount1 = new BankAccount(1L , "123123123",bank , "AM.Solvd");

        Address customerAddress = new Address(2L , "Spain", "Madrid" , "Alta via", "231");
        Customer customer1 = new Customer(1L , "Lautaro" , "Moreira" , "1131123312" , new Date(2001, 06 , 06) , "lmoreira@gmail.com", customerAddress);

        Department department1 = new Department(1L , "Human Resources (HR)");
        Department department2 = new Department(2L , "Marketing");

        Address depositAddress = new Address(3L , "Argentina", "Buenos aires" , "Corrientes", "123312");
        Deposit deposit1 = new Deposit(1L , 20L , depositAddress);

        Employee employee1 = new Employee(1L , 15.4D , "Jhon" , "Doe", "123123123", new Date(1993, 12 , 16) , "jdoe.laba@solvd.com");
        Employee employee2 = new Employee(2L, 20.8D, "Alice", "Johnson", "987654321", new Date(1990, 5, 22), "ajohnson@example.com");
        Employee employee3 = new Employee(1L , 15.4D , "Jhon" , "Doe", "123123123", new Date(1993, 12 , 16) , "jdoe.laba@solvd.com");

        if (employee1.equals(employee2)){
            System.out.println("Employees are equals");
        }else{
            System.out.println("Employees are not equals");
        }

        if (employee1.equals(employee3)){
            System.out.println("Employees are equals");
        }else{
            System.out.println("Employees are not equals");
        }

        try {

            employee1.addHourWorked(5D);
            System.out.println(employee1.calculatePayment());

            employee1.addHourWorked(10D);
            System.out.println(employee1.calculatePayment());

            employee1.addHourWorked(-2D);
            System.out.println(employee1.calculatePayment());

        }catch (invalidHoursException ex) {
            System.out.println(ex.getMessage());
        }finally
        {
            System.out.println("finally block executed");
        }

        Product laptop = new Product(1L, "Laptop", 10, 799.99);
        Product smartphone = new Product(2L, "Smartphone", 20, 499.99);
        Product headphones = new Product(3L, "Headphones", 50, 39.99);
        Product tablet = new Product(4L, "Tablet", 15, 299.99);

        customer1.addSale(laptop, 2);
        customer1.addSale(headphones, 1);

        Double totalPriceCustomer1Sales = customer1.calculatePayment();
        System.out.println(totalPriceCustomer1Sales);


    }
}