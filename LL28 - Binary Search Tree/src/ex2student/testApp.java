package ex2student;

public class testApp {

    public static void main(String[] args) {
        BSTreeSet tree = new BSTreeSet();
        tree.add(11);
        tree.add(15);
        tree.add(22);
        tree.add(25);
        tree.add(30);
        tree.add(45);
        tree.add(77);
        tree.add(88);
        tree.add(90);

        System.out.println("Printing the tree:\n" + tree);
        System.out.println();
        System.out.println("Max entry in the tree:\n" + tree.max());
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Removing the smallest entry in the BST:");
        System.out.println(tree.removeMin());
        System.out.println("Tree after removal:\n" + tree);
        System.out.println();
        System.out.println("Removing the new smallest entry in the BST:");
        System.out.println(tree.removeMin());
        System.out.println("Tree after removal:\n" + tree);
        System.out.println();
        System.out.println("Removing the new smallest entry in the BST:");
        System.out.println(tree.removeMin());
        System.out.println("Tree after removal:\n" + tree);
        System.out.println();
        System.out.println("Removing the new smallest entry in the BST:");
        System.out.println(tree.removeMin());
        System.out.println("Tree after removal:\n" + tree);
        System.out.println();
        System.out.println("Removing the new smallest entry in the BST:");
        System.out.println(tree.removeMin());
        System.out.println("Tree after removal:\n" + tree);
        System.out.println();
        System.out.println("Removing the new smallest entry in the BST:");
        System.out.println(tree.removeMin());
        System.out.println("Tree after removal:\n" + tree);
        System.out.println();
        System.out.println("Removing the new smallest entry in the BST:");
        System.out.println(tree.removeMin());
        System.out.println("Tree after removal:\n" + tree);
        System.out.println();
        System.out.println("Removing the new smallest entry in the BST:");
        System.out.println(tree.removeMin());
        System.out.println("Tree after removal:\n" + tree);
        System.out.println();
        System.out.println("Removing the new smallest entry in the BST:");
        System.out.println(tree.removeMin());
        System.out.println("Tree after removal:\n" + tree);
    }
}