package by.bsuir.students;

/**
 * Объект типа <code>Student</code> описывает id, имя, группу и средний балл студента
 * @author Alina Barbashova
 */
public class Student {
    private String name;
    private int groupNumber;
    private double averageMark;
    private int id;
    private static int nextId =1;
    public Student(String n, int g, double m){
        name = n;
        groupNumber = g;
        averageMark = m;
        id = nextId;
        nextId++;
    }
    public Student(String n, int g){
        this(n,g,0.0);
    }

    /**
     * @param otherStudent является студентом с которым сравнивают оценку текущего студента
     * @return возвращает true если оценка текущего выше и false - если ниже
     */
    public boolean HasHigherMark(Student otherStudent){
        return this.averageMark > otherStudent.averageMark;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    public String toString(){
        return String.format("Student: name = %s, groupNumber = %d", name, groupNumber);
    }
}
