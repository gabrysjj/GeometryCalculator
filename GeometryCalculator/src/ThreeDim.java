public class ThreeDim {
    private Figure base;
    private double height;

    public ThreeDim(Figure base, double height) {
        this.base = base;
        this.height = height;
    }
    public double calculateVolume() {
        return base.calculateArea() * height;
    }
    public double calculateSurfaceArea() {
        return 2 * base.calculateArea() + base.calculatePerimeter() * height;
    }
    public void print() {
        System.out.println("ThreeDim Height: " + height);
        System.out.println("ThreeDim Volume: " + calculateVolume());
        System.out.println("ThreeDim Area: " + calculateSurfaceArea());
    }
}
