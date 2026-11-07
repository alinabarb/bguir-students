package by.bsuir.students;
public class Main {
    public static void main(String[] args) {
        var alina = new Student("Alina", 400512, 5.0);
        Student[] gr = new Student[2];
        gr[0] = alina;
        gr[1] = new Teacher("Nick", 410901, 5.5, "English");
        for(Student g: gr){
            System.out.println(g.toString());
        }
    }
}