package edu.wctc;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	    Employee mario = new Employee(1,"Mario", 24.50, LocalDate.of(2000,12,1));
        Employee luigi = new Employee(2, "Luigi", 19.50, LocalDate.of(2002,4,15));
        Employee peach = new Employee(3, "Peach", 50.00, LocalDate.of(2010,6,3));
        List<Employee> employees = new ArrayList<>();
        employees.add(mario);
        employees.add(luigi);
        employees.add(peach);

        Product superMushroom = new Product(3, "A1B2002", "Super Mushroom", 5.00);
        Product iceFlower = new Product(5, "A2B1001", "Ice Flower", 10.00);
        Product superStar = new Product(8, "A3B3003", "Super Star", 5.00);
        Set<Product> inventory = new HashSet<>();
        inventory.add(superMushroom);
        inventory.add(iceFlower);
        inventory.add(superStar);

        Map<String, String> productType = new HashMap<>();
        productType.put("A1", "Red");
        productType.put("A2", "Blue");
        productType.put("A3", "Yellow");
        productType.put("B1", "Flower");
        productType.put("B2", "Mushroom");
        productType.put("B3", "Star");

        Map<String, String> typeDescription = new HashMap<>();
        typeDescription.put("A", "Color");
        typeDescription.put("B", "Classification");

        boolean exit = false;

        while (!exit){
            System.out.println("Welcome!");
            System.out.println("1. Employee Salary Calculator");
            System.out.println("2. Inventory Checker");
            System.out.println("3. Exit");
            switch (input.nextInt())
            {
                case 1:
                    salaryCalc(employees);
                    break;
                case 2:
                    inventoryCheck(inventory, productType);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid selection. Try again.");
            }

        }
    }

    public static void inventoryCheck(Set<Product> inventory, Map<String, String> productType) {
        Scanner input = new Scanner(System.in);
        String sku;
        boolean match = false;
        System.out.println("Enter Product SKU: ");
        sku = input.nextLine();
        for (Product product : inventory) {
            if (product.getSku().compareTo(sku) == 0) {
                match = true;
                System.out.println(product.toString());
                System.out.printf("Classification: %s%n",productType.get("B"+sku.charAt(3)));
                System.out.printf("Color: %s%n",productType.get("A"+sku.charAt(1)));
                System.out.println("Press Enter to return to the main menu...");
                input.nextLine();
            }
        }
        if (!match)
            System.out.println("Invalid SKU. Returning to main menu.");
    }

    public static void salaryCalc(List<Employee> employees) {
        Scanner input = new Scanner(System.in);
        double hours;
        System.out.println("Employee Salary Calculator");
        for (Employee emp : employees) {
            System.out.printf("%d. %s%n", emp.getEmployeeNumber(), emp.getName());
        }
        switch (input.nextInt())
        {
            case 1:
                System.out.printf("Hours worked by %s: ", employees.get(0).getName());
                hours = input.nextDouble();
                System.out.println(employees.get(0).toString());
                System.out.printf("Calculated Salary: %.2f\n", employees.get(0).calculateSalary(hours));
                System.out.println("Press Enter to return to the main menu...");
                input.nextLine();
                input.nextLine();
                break;
            case 2:
                System.out.printf("Hours worked by %s: ", employees.get(1).getName());
                hours = input.nextDouble();
                System.out.println(employees.get(1).toString());
                System.out.printf("Calculated Salary: %.2f\n", employees.get(1).calculateSalary(hours));
                System.out.println("Press Enter to return to the main menu...");
                input.nextLine();
                input.nextLine();
                break;
            case 3:
                System.out.printf("Hours worked by %s: ", employees.get(2).getName());
                hours = input.nextDouble();
                System.out.println(employees.get(2).toString());
                System.out.printf("Calculated Salary: %.2f\n", employees.get(2).calculateSalary(hours));
                System.out.println("Press Enter to return to the main menu...");
                input.nextLine();
                input.nextLine();
                break;
            default:
                System.out.println("Invalid selection. Returning to main menu.");
        }

    }
}
