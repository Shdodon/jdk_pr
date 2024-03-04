package hw4;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "+888888888", "Тютчев Федор Федорович", 5));
        employees.add(new Employee(2, "+777777777", "Котельникова Анна Иоановна", 3));
        employees.add(new Employee(3, "+666666666", "Петрова Анеглина Михайловна", 7));
        employees.add(new Employee(4, "+555555555", "Павлов Павел Павлович", 10));
        employees.add(new Employee(5, "+444444444", "Петров Петр Петрович", 5));
        employees.add(new Employee(6, "+333333333", "Иванов Иван Иванович", 7));
        EmployeeList list = new EmployeeList(employees);

        List<Employee> employeesWithExperience = list.findEmployeesByExperience(3);
        System.out.println("Сотрудник со стажем 3 года:");
        for (Employee employee : employeesWithExperience) {
            System.out.println(employee.getName());
        }

        List<String> PhoneNumByName = list.findPhoneNumbersByName("Петрова Анеглина Михайловна");
        System.out.println("Номер телефона Петрова Анеглина Михайловна:");
        for (String phoneNumber : PhoneNumByName) {
            System.out.println(phoneNumber);
        }

        Employee employeeWithCertainID = list.findEmployeeByEmployeeId(6);
        if (employeeWithCertainID != null) {
            System.out.println("Сотрудник с таб.номером 6: " + employeeWithCertainID.getName());
        } else {
            System.out.println("Сотрудник не найден! Проверьте таб.номер!");
        }



    }

    }

