package ru.geekbrains.java_one.lesson_5;

public class Greyhound extends Dog {
    public Greyhound(String name, int age) {
        super(name, age);
    }

    @Override
    public void run(int length) {
        if (length > 800) {
            System.out.println(this.name + " не может пробежать дальше, устала");
        } else System.out.println(this.name + " пробежал");
    }

}
