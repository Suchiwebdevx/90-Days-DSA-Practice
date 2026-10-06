public class InsertCharacters {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("HelloWorld");

        sb.insert(5, " ");

        System.out.println(sb);
    }
}
