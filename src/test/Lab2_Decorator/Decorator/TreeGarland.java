package Lab2_Decorator.Decorator;


import Lab2_Decorator.yol.Tree;
import jakarta.decorator.Decorator;
import lombok.NoArgsConstructor;



@Decorator

@NoArgsConstructor
public class TreeGarland implements Tree {

    private Tree tree;

    public TreeGarland(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String getDescription() {
        return tree.getDescription() + " with a tree garland";
    }
}


