package by.bsuir.students;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var alina = new Student("Alina", 400512, 5.0);
        var gr = new ArrayList<Student>();
        gr.add(alina);
        gr.add(new Teacher("Nick", 410901, 5.5, "English"));
        for(Student g: gr){
            System.out.println(g.toString());
        }
    }
}