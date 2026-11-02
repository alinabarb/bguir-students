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
    public boolean HasHigherMark(Student otherStudent){
        return this.averageMark > otherStudent.averageMark;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
