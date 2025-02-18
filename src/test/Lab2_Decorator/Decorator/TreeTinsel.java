package Lab2_Decorator.Decorator;


import Lab2_Decorator.yol.Tree;
import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;
import lombok.NoArgsConstructor;



@Decorator

@NoArgsConstructor
public class TreeTinsel implements Tree {


    @Inject
    @Delegate
    private Tree tree;

    public TreeTinsel(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String getDescription() {
        return tree.getDescription() + " with tree tinsel";
    }
}


