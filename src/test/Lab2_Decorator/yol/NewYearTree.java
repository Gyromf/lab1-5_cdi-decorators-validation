package Lab2_Decorator.yol;


import jakarta.enterprise.inject.Default;

@Default

public class NewYearTree implements Tree {

    private String description;

    public NewYearTree() {
        description = "Simple New Year tree";
    }

    @Override
    public String getDescription() {
        return description;
    }
}



