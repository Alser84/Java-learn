package ru.geekbrains.java_one.lesson_4;

public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee("Sergey Ivanov", 100000, 45);
        Employee em2 = new Employee("Pavel Isaev", 50000, 55);
        Employee em3 = new Employee("Vasily Kulikov", 150000, 35);
        Employee em4 = new Employee("Denis Petrov", 20000, 30);
        Employee em5 = new Employee("Petr Sidorov", 40000, 25);

        int sumAge = 0;
        double sumSalary = 0;

        //Задание 4
        System.out.printf("Full name: %s of age %d\n", em1.getFullName(), em1.getAge());
        Employee[] employees = {em1, em2, em3, em4, em5};
        for (int i = 0; i < employees.length; i++) {
            sumAge += employees[i].getAge();
            sumSalary += employees[i].getSalary();
            if (employees[i].getAge() > 40) {
                System.out.println("Возраст " + employees[i].getFullName() + " составляет " + employees[i].getAge() + " лет");
            }
            if (employees[i].getAge() > 45) {
                employees[i].setSalary(salaryUp(employees[i].getSalary()));
            }

        }
        System.out.println("Среднее арифметическое зарплаты: " + sumSalary/employees.length);
        System.out.println("Среднее арифметическое возраста: " + sumAge/employees.length);
    }
    //Задание 5
    public static double salaryUp(double a){
        return a+5000;
    }


}
