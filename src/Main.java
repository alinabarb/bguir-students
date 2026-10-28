
public class Main {
    public static void main(String[] args) {
        var alina = new Student("Alina", 400512, 5.0);
        var lili = new Student("Lily", 631222, 3.6);
        System.out.printf("Student %s has an id %d\n", alina.getName(), alina.getId());
        System.out.printf("Student %s has an id %d", lili.getName(), lili.getId());
    }
}