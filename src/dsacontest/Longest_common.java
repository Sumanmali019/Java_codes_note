package dsacontest;

public class Longest_common {
    public String longestCommonPrefix(String[] s) {

        if (s == null || s.length == 0) {
            return "";
        }

        for (int i = 0; i < s[0].length(); i++) {
            char c = s[0].charAt(i);

            for (int j = 1; j < s.length; j++) {
                if (i == s[j].length() || s[j].charAt(i) != c) {
                    return s[0].substring(0, i);
                }
            }

        }
        return "";
    }

    public static void main(String[] args) {
        Longest_common longest_common = new Longest_common();

        String[] strs = { "flower", "fldog", "flcat" };

        String ans = longest_common.longestCommonPrefix(strs);

        System.out.println(ans);
    }

}
