package BitmanupulationBasic;
/*
 Given two binary strings A and B. Return their sum (also a binary string).
 */

public class AddBinaryToString {
    public String addBinary(String A, String B) {

        int a = A.length() - 1, b = B.length() - 1;
        int carry = 0, current_sum = 0;
        StringBuilder ans = new StringBuilder();
        while (b >= 0 || a >= 0) {
            if (b >= 0 && a >= 0) {
                current_sum = carry + A.charAt(a) + B.charAt(b) - 96;
            } else if (b >= 0) {
                current_sum = carry + B.charAt(b) - 48;
            } else {
                current_sum = carry + A.charAt(a) - 48;
            }
            ans.insert(0, current_sum % 2);
            carry = (current_sum) / 2;
            b--;
            a--;
        }
        if (carry == 1) {
            ans.insert(0, 1);
        }
        return ans.toString();

    }

}
