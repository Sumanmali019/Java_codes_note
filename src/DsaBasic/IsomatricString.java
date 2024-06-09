package DsaBasic;

import java.util.HashMap;

public class IsomatricString {
    public boolean isomatric(String s, String t) {

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        int s1 = 0;
        int t1 = 0;

        while (s1 < s.length() && t1 < t.length()) {

            if ((sMap.containsKey(s.charAt(s1)) && sMap.get(s.charAt(s1)) != t.charAt(t1))
                    || tMap.containsKey(s.charAt(t1)) && (tMap.get(t.charAt(t1)) != t.charAt(s1))) {
                return false;
            }
            sMap.put(s.charAt(s1), t.charAt(t1));
            tMap.put(t.charAt(t1), s.charAt(s1));
            s1 += 1;
            t1 += 1;
        }
        return true;

    }

}
