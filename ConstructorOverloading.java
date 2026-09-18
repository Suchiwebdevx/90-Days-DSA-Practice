package OOps;

class Student {

    String name;
    int age;

    // No-argument constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // One parameter
    Student(String n) {
        name = n;
        age = 0;
    }

    // Two parameters
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Suchi");
        Student s3 = new Student("Rahul", 22);

        s1.display();
        s2.display();
        s3.display();
    }
}