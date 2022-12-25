package ba.unsa.etf.rpr;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("    *");
        System.out.println("   * *");
        System.out.println("  *   *");
        System.out.println(" *     *");
        System.out.println("*********");
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}
