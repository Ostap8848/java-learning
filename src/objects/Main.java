package objects;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree tree1 = new Tree(15);
        Tree tree2 = new Tree(25, 45, 2, "oak");
        tree1.setHeight(17);
        System.out.println(tree1.getHeight());
        System.out.println("Filling first tree object...");
        tree.setDiameter(4);
        tree.setHeight(25);
        tree.setSpecies("Beech");
        tree.setWidthOfCrown(46);
        System.out.println("First tree is ready");
        System.out.println(tree);
        System.out.println("Second tree isn`t filled");
        System.out.println(tree1);
        tree1.setWidthOfCrown(50);
        tree1.setSpecies("Birch");
        tree1.setHeight(31);
        tree1.setDiameter(24);
        System.out.println("Sceond tree is ready");
        System.out.println(tree1);
        tree2.setDiameter(41);
        tree2.setHeight(47);
        tree2.setSpecies("Larch");
        tree2.setWidthOfCrown(24);
        System.out.println("Third tree is ready");
        System.out.println(tree2);

        tree1.setSpecies(tree2.getSpecies());

    }
}
