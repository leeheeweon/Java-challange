package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");

        for(String s : data) {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
    }
}
