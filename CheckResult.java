package OOps;

public class CheckResult {

    String name;
    int marks;

    void checkResult() {

        if (marks >= 40) {
            System.out.println(name + " has Passed");
        } else {
            System.out.println(name + " has Failed");
        }
    }

    public static void main(String[] args) {

        CheckResult s = new CheckResult();

        s.name = "Rahul";
        s.marks = 75;

        System.out.println("Name: " + s.name);
        System.out.println("Marks: " + s.marks);

        s.checkResult();
    }
}