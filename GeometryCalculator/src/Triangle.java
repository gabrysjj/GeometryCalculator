import java.io.IOException;

class Triangle extends Figure {
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculateArea() {
        double halfPerimeter = 0.0, result = 0.0;
        halfPerimeter = (sideA + sideB + sideC) / 2;
        result = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
        return result;
    }

    @Override
    double calculatePerimeter() {
        double result = 0.0;
        result = sideA + sideB + sideC;
        return result;
    }

    @Override
    public void print() {
        System.out.println("Triangle: " + sideA + ", " + sideB + ", " + sideC);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
