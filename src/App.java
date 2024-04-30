import udemy.LinkList.LinKlists;

public class App {

    public static void main(String[] args) throws Exception {
        LinKlists myKlists = new LinKlists(0);

        myKlists.append(2);

        // myKlists.append(23);
        // myKlists.append(7);

        // myKlists.PrintList();

        // System.out.println();
        // // (2) Item - return 2 node
        // System.out.println(myKlists.removeLast().value);

        // // (1) Item - return 1 node
        // System.out.println(myKlists.removeLast().value);

        // // (0) Item - return null
        // System.out.println(myKlists.removeLast());

        // myKlists.prepend(1);

        // myKlists.PrintList();

        // System.out.println();

        // // (2) Item - return 2 node
        // System.out.println(myKlists.revmoveFrist().value);

        // // (1) Item - return 1 node
        // System.out.println(myKlists.revmoveFrist().value);

        // // (0) Item - return null
        // System.out.println(myKlists.revmoveFrist());

        // System.out.println(myKlists.get(2).value + "\n");

        // myKlists.set(2, 90);

        myKlists.Insert(1, 1);

        myKlists.PrintList();

    }
}
