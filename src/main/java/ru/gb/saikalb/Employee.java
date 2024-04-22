package ru.gb.saikalb;

/**
 * Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
 * представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
 */

import java.time.LocalDate;
import java.time.Period;

/**
 * Класс, представляющий сотрудника.
 */
public class Employee {

    private String name;
    private double salary;
    private LocalDate birthDate;

    /**
     * Конструктор сотрудника.
     *
     * @param name   Имя сотрудника
     * @param salary Зарплата сотрудника
     */
    public Employee(String name, double salary, LocalDate birthDate) {
        this.name = name;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    /**
     * Получить имя сотрудника.
     *
     * @return Имя сотрудника
     */
    public String getName() {
        return name;
    }

    /**
     * Получить зарплату сотрудника.
     *
     * @return Зарплата сотрудника
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Получить возраст сотрудника.
     *
     * @return возраст сотрудника
     */
    public double getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    /**
     * Повысить зарплату сотрудника.
     *
     * @param amount Сумма повышения
     */
    public void increaseSalary(double amount) {
        salary += amount;
    }

    /**
     * Переопределение метода toString().
     *
     * @return Строковое представление сотрудника
     */
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary + " " +
                "age =" + getAge() + '}';
    }
}

