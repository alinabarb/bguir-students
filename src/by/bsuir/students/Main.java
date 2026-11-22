package by.bsuir.students;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var alina = new Student("Alina", 400512,5.0, Faculty.FRE);
        var gr = new ArrayList<Student>();
        gr.add(alina);
        var nick = new Teacher("Nick", 410901, 5.5, Faculty.FEE, "English");
        gr.add(nick);
        for(Student g: gr){
            System.out.println(g);
        }
        System.out.print(calculateAverageMark(alina, nick));
    }
    static double calculateAverageMark(Student... students){
        double sum = 0;
        if(students.length == 0) return 0;
        for(Student s: students){
            sum+=s.getAverageMark();
        }
        return sum/students.length;
    }
}