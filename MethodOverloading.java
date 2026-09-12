package OOps;

class MethodOverLoading {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        MethodOverLoading c = new MethodOverLoading();

        c.add(10, 20);
        c.add(10, 20, 30);
        c.add(10.5, 20.5);
    }
}