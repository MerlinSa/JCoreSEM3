package ru.gb.saikalb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Главный класс приложения
 */
public class Main {

    public static void main(String[] args) {
        // Создание списка сотрудников
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tom Soyer", 2000, LocalDate.of(1990,5,5)));
        employees.add(new Employee("Mike Denver", 3000, LocalDate.of(2000, 1, 1)));
        employees.add(new Manager("Stiven Black", 5000, LocalDate.of(1989, 12, 2)));
        System.out.println("Before salary increase:");
        for (Employee employee : employees) {
            System.out.println(employee);}

        // Сортировка списка сотрудников по возрасту
        Collections.sort(employees, new AgeComparator());

        System.out.println("\nSorting by age:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Повышение зарплаты всем сотрудникам, кроме руководителей
        Manager.increaseSalary(employees.toArray(new Employee[0]), 1000);
        System.out.println("\nAfter salary increase:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        // Сортировка списка сотрудников по зарплате
        Collections.sort(employees, new SalaryComparator());
        System.out.println("\nSorting by salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
