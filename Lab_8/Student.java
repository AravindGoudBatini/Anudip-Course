package Lab_8;

class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void speak() {
        System.out.println(name + " is speaking.");
    }
}

class Student extends Person {
    String grade;
    
    public Student(String name, int age, String grade) {
        super(name, age); 
        this.grade = grade;
    }
    
    public void study() {
        System.out.println(name + " is studying in grade " + grade + " of age :"+age);
    }

    public static void main(String[] args) {
        Student student = new Student("Elsa", 23, "A");
        
        student.speak();
        student.study();
    }
}
