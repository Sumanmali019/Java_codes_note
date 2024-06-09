package DsaBasic.DSAmaths2;

/*
Problem Description
Given a positive integer A, return its corresponding column title as it appears in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB  
 */

public class ExcelColumn {

    public String solveme(int A) {
        String ans = "";
        while (A > 0) {
            ans = (char) (((A - 1) % 26) + 'A') + ans;
            A = ((A - 1) / 26);
        }

        return ans;

        /*
         * 
         */
    }

    public static void main(String[] args) {
        ExcelColumn column = new ExcelColumn();
        int a = 28;
        String ans = column.solveme(a);
        System.out.println(ans);
    }

}
