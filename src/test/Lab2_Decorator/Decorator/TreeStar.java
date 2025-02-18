package Lab2_Decorator.Decorator;


import Lab2_Decorator.yol.Tree;
import jakarta.decorator.Decorator;


@Decorator


public class TreeStar implements Tree {

    private Tree tree;

    public TreeStar(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String getDescription() {
        return tree.getDescription() + " with a tree star";
    }
}



