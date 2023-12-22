package HW_Algorithms.HW_Sem_04;


public class Main {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(9);
        tree.add(1);
        tree.add(6);

        System.out.println(tree.contains(3));
        System.out.println(tree.contains(10));
        System.out.println();
        System.out.println(tree.toString());

    }
}
