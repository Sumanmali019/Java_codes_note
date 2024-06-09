package DsaBasic;

/*
 Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters
 without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
public class IsSubswquence {

    public boolean isSubs(String s, String t) {

        int s1 = 0;

        if (s.length() < 1) {
            return true;
        }

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(s1) == t.charAt(i)) {
                s1++;
                return true;

                // if (s1 == s.length()) {
                // return true;
                // }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        IsSubswquence isSubswquence = new IsSubswquence();
        String a = "abc";
        String B = "abcdsg";

        Boolean isTrue = isSubswquence.isSubs(a, B);

        System.out.println(isTrue);

    }

}
