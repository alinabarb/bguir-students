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
    private Faculty faculty;
    public Student(String name, int groupName, double averageMark, Faculty faculty){
        this.name = name;
        this.groupNumber = groupName;
        this.averageMark = averageMark;
        this.faculty = faculty;
        id = nextId;
        nextId++;
    }
    public Student(String name, int groupName, Faculty faculty){
        this(name, groupName, 0.0, faculty);
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
    public double getAverageMark(){ return averageMark;}
    @Override
    public String toString(){
        return String.format("Student: name = %s, faculty = %s, groupNumber = %d", name, faculty, groupNumber);
    }
}
