package ru.alserr;

public class Main {

    public static void main(String[] args) {
        compute(2,3,4,2);
        checkSumOfTwoDigit(10,5);
        positiveOrNeative(-1);
        greeting("Джошуа");
        checkYear(1984);
    }
    //Задание 1
    private static float compute(int a, int b, int c, int d) {
        float result = 0;
        try {
            result = a * (b + (c / d));
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Нельзя делить на ноль");
        }
        return result;
    }
    //Задание 2
    private static boolean checkSumOfTwoDigit(int a,int b){
        int sum = a + b;
        if(sum >= 10 && sum <= 20){
            System.out.println(true);
            return true;
        } else System.out.println(false);
            return false;
        //return sum <= 20 && sum >= 20
    }
    //Задание 3
    private static void positiveOrNeative(int a){
        if (a >= 0 ){
            System.out.println("Положительное число");
        }else System.out.println("Отрицательное число");
        //return a >=0;
    }
    //Задание 4
    private static void greeting(String name){
        System.out.println("Привет, " + name + "!");
    }
    //Задание 5
    private static void checkYear(int year){
        if (year % 400 == 0) {
            System.out.println("Високосный");
            return;
        } else if (year % 100 == 0) {
            System.out.println("Не високосный");
            return;
        } else if (year % 4 == 0) {
            System.out.println("Високосный");
            return;
        }
        System.out.println("Не високосный");
    }
}
