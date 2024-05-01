package DsaBasic.DsaIntermeditaContest;

/*
 * 
 * Given a string toogle the allphabet
 */
public class ToggleCase {

    public String toggle(String A) {

        StringBuilder stringBuilder = new StringBuilder();

        int a = A.length();
        for (int i = 0; i < a; i++) {
            char c = A.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                stringBuilder.append((char) (c + 32));
            } else if (c >= 'a' && c <= 'z') {
                stringBuilder.append((char) (c - 32));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ToggleCase tg = new ToggleCase();
        String A = "Hello";
        String ans = tg.toggle(A);
        System.out.println(ans);

    }
}
