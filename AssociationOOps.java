package OOps;

class AssociationOOps {

    String name = "Rahul";

    void teach() {
        System.out.println("Teacher is teaching");
    }
}

class Student {

    String name = "Amit";

    void study() {
        System.out.println("Student is studying");
    }
}

class AssociationMain {

    public static void main(String[] args) {

        AssociationOOps t = new AssociationOOps();
        Student s = new Student();

        System.out.println(t.name + " teaches " + s.name);
    }
}