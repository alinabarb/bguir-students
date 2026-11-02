
public class Main {
    public static void main(String[] args) {
        var alina = new Student("Alina", 400512, 5.0);
        var lili = new Student("Lily", 631222);
        System.out.print(alina.HasHigherMark(lili));
    }
}