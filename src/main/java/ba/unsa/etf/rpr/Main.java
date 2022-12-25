package ba.unsa.etf.rpr;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new ShapeFactory().getShape("Triangle");
        triangle.draw();
        System.out.println("Number of sides: " + triangle.numberOfSides());
    }
}