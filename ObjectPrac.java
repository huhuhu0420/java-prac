
class Student {
    public String name;
    public int score;
    Student (String n, int s) {
        name = n;
        score = s;
    }
    public static void hello () {
        System.out.println("hello");
    }
}

public class ObjectPrac {
    public static void main(String[] args) {
        Student tom = new Student("Tom", 88);
        Student aa = new Student("aa", 69);
        Student.hello();
    }
}
