class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        double result = Math.PI * radius * radius;
        return result;
    }

    @Override
    double calculatePerimeter() {
        double result = 2 * Math.PI * radius;
        return result;
    }

    @Override
    public void print() {
        System.out.println("Circle: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
