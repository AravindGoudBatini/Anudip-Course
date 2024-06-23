package Lab_11;

interface Person {
    void speak();
}
class Student implements Person {
    public void speak() {
        System.out.println("I am a student.");
    }
}
class Teacher implements Person {
    public void speak() {
        System.out.println("I am a teacher.");
    }
}
public class SpeakInterface {
    public static void main(String[] args) {
        Student student = new Student();
        student.speak();
        Teacher teacher = new Teacher();
        teacher.speak();
    }
}

