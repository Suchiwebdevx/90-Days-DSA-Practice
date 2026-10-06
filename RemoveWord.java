public class RemoveWord {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("I love Java programming");

        sb.delete(7, 12);

        System.out.println(sb);
    }
}
