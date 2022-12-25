package ba.unsa.etf.rpr;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        switch (shapeType.toUpperCase()) {
            case "CIRCLE":
                return new Circle();
            case "TRIANGLE":
                return new Triangle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
