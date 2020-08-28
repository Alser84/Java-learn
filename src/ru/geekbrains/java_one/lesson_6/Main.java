package ru.geekbrains.java_one.lesson_6;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        writeText();
    }
    private static void writeText() throws IOException {
        String str1 = "My uncle, of the best traditions, When being almost deceased,\n";
        String str2 = "Forced men to treat him with distinction, Which was the best of his ideas.";
        BufferedWriter writer1 = new BufferedWriter(new FileWriter("text1.txt"));
        BufferedWriter writer2 = new BufferedWriter(new FileWriter("text2.txt"));
        writer1.write(str1);
        writer2.write(str2);
        writer1.close();
        writer2.close();

        File file = new File("text1.txt");
        FileWriter fr = new FileWriter(file, true);
        fr.write(str2);
        fr.close();

    }
}
