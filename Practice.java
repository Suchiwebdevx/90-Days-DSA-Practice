public class Practice {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java is very powerful");

        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == ' ') {
                sb.deleteCharAt(i);
                i--;
            }
        }

        System.out.println(sb);
    }
}
