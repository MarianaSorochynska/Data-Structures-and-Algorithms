class Main {
  public static void main(String[] args) {

    // Step 1 - Create a BST tree object called lab5Tree
    BST<Integer> tree = new BST<>();

    // Step 2 - Insert the following values: 13, 22, 36, 5, 48, 17, 39, 2, 26, 40,
    // 29, 34, 10
    int[] values = { 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10 };

    for (int v : values) {
      tree.insert(v);
    }

    // Step 3 - Delete the value 17
    tree.delete(17);

    // Step 4 - Traverse and output the values using inorder (sorted)
    System.out.println("Inorder traversal:");
    tree.inorder();
    System.out.println();

    // Step 5 - Traverse and output the values using postorder
    System.out.println("Postorder traversal:");
    tree.postorder();
    System.out.println();

    // Step 6 - Traverse and output the values using preorder
    System.out.print("Preorder: ");
    tree.preorder();
    System.out.println();

    // Step 7 - Display the result of a search for the value 36
    System.out.println("Search for 36: " + tree.search(36));

    // Step 8 - Display the result of a search for the value 37
    System.out.println("Search for 37: " + tree.search(37));

    // Step 9 - Using the path() method, display the path from the root to 2
    System.out.print("Path from root to 2: ");
    for (BST.TreeNode<Integer> node : tree.path(2)) {
      System.out.print(node.element + " ");
    }
    System.out.println();

    // Step 10 - Display the path from the root to 34
    System.out.print("Path from root to 34: ");
    for (BST.TreeNode<Integer> node : tree.path(34)) {
      System.out.print(node.element + " ");
    }
    System.out.println();

  }
}