package ru.geekbrains.java_one.lesson_5;

public class Taksa extends Dog {
    public Taksa(String name, int age) {
        super(name, age);
    }

    @Override
    public void run(int length) {
        if (length > 400) {
            System.out.println(this.name + " не может пробежать дальше, ножки коротки");
        } else System.out.println(this.name + " пробежал");
    }
}
