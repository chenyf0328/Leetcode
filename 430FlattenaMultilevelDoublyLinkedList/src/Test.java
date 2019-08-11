public class Test {
    public static void main(String[] args) {
        Node root1 = new Node();
        Node root2 = new Node();
        Node root3 = new Node();
        Node root4 = new Node();
        Node root7 = new Node();
        Node root8 = new Node();

        root1.val = 1;
        root2.val = 2;
        root3.val = 3;
        root4.val = 4;
        root7.val = 7;
        root8.val = 8;

        root1.prev = null;
        root1.next = root2;
        root1.child = null;

        root2.prev = root1;
        root2.next = root3;
        root2.child = null;

        root3.prev = root2;
        root3.next = root4;
        root3.child = root7;

        root7.prev = null;
        root7.next = root8;
        root7.child = null;

        root8.prev = root7;
        root8.next = null;
        root8.child = null;

        root4.prev = root3;
        root4.next = null;
        root4.child = null;

        Solution430 s = new Solution430();
        Node result = s.flatten(root1);

        System.out.println(result.val);
    }
}
