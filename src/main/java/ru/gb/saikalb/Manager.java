package ru.gb.saikalb;

import java.time.LocalDate;

/**
 * Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты
 * в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме
 * руководителей. В основной программе создайте руководителя и поместите его в общий массив сотрудников.
 * Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 */

public class Manager extends Employee {
    /**
     * Конструктор менеджера
     * @param name имя менеджера
     * @param salary его зп
     * @param birthDate его др.
     */
    public Manager(String name, double salary, LocalDate birthDate) {
        super(name, salary, birthDate);
    }

    /**
     * Статический метод для повышения зарплаты сотрудников, кроме руководителей.
     *
     * @param emp Массив сотрудников
     * @param amount    Сумма повышения
     */
    public static void increaseSalary(Employee[] emp, double amount) {
        for (Employee employee : emp) {
            if (!(employee instanceof Manager)) {
                employee.increaseSalary(amount);
            }
        }
        System.out.println("After salary increase:");
    }

}
