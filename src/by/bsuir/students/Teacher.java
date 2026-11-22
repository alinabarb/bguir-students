package by.bsuir.students;

public class Teacher extends Student{
    private String subject;
    public Teacher(String name, int groupNumber, double averageMark, Faculty faculty, String subject){
        super(name, groupNumber, averageMark, faculty);
        this.subject = subject;
    }
    @Override
    public String toString(){
        return super.toString() + String.format(", subject = %s", subject);
    }

}
