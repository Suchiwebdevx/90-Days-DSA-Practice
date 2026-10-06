public class ReplaceWord {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("I am learning Python");

        sb.replace(14, 20, "Java");

        System.out.println(sb);
    }
}
