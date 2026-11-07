package by.bsuir.students;

public class Teacher extends Student{
    private String subject;
    public Teacher(String n, int g, double m, String sub){
        super(n, g, m);
        subject = sub;
    }
    public String toString(){
        return super.toString() + String.format(", subject = %s", subject);
    }

}
