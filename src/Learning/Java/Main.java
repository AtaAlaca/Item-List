package Learning.Java;

public class Main {

    public static void main(String[] args) {

        SearchTree tree = new SearchTree(null);

        //Created a string data array to avoid typing loads of addItem instructions.
        String stringData = "5 7 3 9 8 2 1 0 4 6" ;

        String[] data = stringData.split(" ");
        for (String s : data) {//Create new item with value set to the string s.
            tree.addItem(new Node(s)) ;
        }

        System.out.println("===============================");

        tree.traverse(tree.getRoot()); //Untouched list.
        System.out.println("===============================");
        tree.removeItem(new Node("3")) ;
        System.out.println("===============================");
        tree.traverse(tree.getRoot()); //New list.
        System.out.println("===============================");


    }
}
