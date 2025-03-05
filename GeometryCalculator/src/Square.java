class Square extends Figure {
    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    double calculateArea() {
        double result = sideA * sideA;
        return result;
    }

    @Override
    double calculatePerimeter() {
        double result = 4 * sideA;
        return result;
    }

    @Override
    public void print() {
        System.out.println("Square: " + sideA);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
