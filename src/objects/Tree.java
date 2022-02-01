package objects;

public class Tree {
    private double height;
    private double widthOfCrown;
    private double diameter;
    private String species;

    public Tree(){}

    public Tree(double height){
        this.height = height;
    }
    public Tree(double height, double widthOfCrown, double diameter, String species){
        this.height = height;
        this.widthOfCrown = widthOfCrown;
        this.diameter = diameter;
        this.species = species;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidthOfCrown() {
        return widthOfCrown;
    }

    public void setWidthOfCrown(double widthOfCrown) {
        this.widthOfCrown = widthOfCrown;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                "m, widthOfCrown=" + widthOfCrown +
                "cm, diameter=" + diameter +
                "cm, species='" + species + '\'' +
                '}';
    }
}
