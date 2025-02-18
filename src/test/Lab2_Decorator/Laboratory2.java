package Lab2_Decorator;


import Lab2_Decorator.Decorator.TreeGarland;
import Lab2_Decorator.Decorator.TreeStar;
import Lab2_Decorator.Decorator.TreeTinsel;
import Lab2_Decorator.yol.NewYearTree;
import Lab2_Decorator.yol.Tree;

public class Laboratory2 {
    public static void main(String[] args) {

        Tree tree = new NewYearTree();
        System.out.println(tree.getDescription());


        tree = new TreeStar(tree);
        System.out.println(tree.getDescription());


        tree = new TreeTinsel(tree);
        System.out.println(tree.getDescription());


        tree = new TreeGarland(tree);
        System.out.println(tree.getDescription());


    }
}


