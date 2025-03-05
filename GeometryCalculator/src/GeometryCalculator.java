import java.util.Scanner;

public class GeometryCalculator {
    private Scanner scanner;
    int figure;

    public GeometryCalculator() {
        this.scanner = new Scanner(System.in);
    }
    public void triangleMenu(){
        //Triangle
        double sideA, sideB, sideC;
        System.out.println("Specify the lengths of the sides of the triangle: ");
        System.out.print("Side A: ");
        sideA = scanner.nextDouble();
        System.out.print("Side B: ");
        sideB = scanner.nextDouble();
        System.out.print("Side C: ");
        sideC = scanner.nextDouble();
        //condition
        if(sideA+sideB<=sideC || sideA+sideC<=sideB || sideB+sideC<=sideA)
        {
            System.out.println("Triangle doesn't exist");
        }
        else
        {
            Triangle triangle = new Triangle(sideA, sideB, sideC);
            triangle.print();
        }
    }
    public void squareMenu(){
        //Square
        double sideA;
        System.out.println("Specify the lengths of the sides of the square: ");
        System.out.print("Side A: ");
        sideA = scanner.nextDouble();
        Square square = new Square(sideA);
        square.print();
    }
    public void circleMenu(){
        //Circle
        double radius;
        System.out.println("Specify the length of the radius of the circle: ");
        System.out.print("Radius: ");
        radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        circle.print();
    }
    public void threeDimMenu(){
        //ThreeDim
        double h;
        System.out.println("Choose base of figure: ");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        int baseThreeDim = scanner.nextInt();
        switch(baseThreeDim){
            case 1:
                Triangle base1;
                double sideA, sideB, sideC;
                System.out.println("Specify the length of the height: ");
                h = scanner.nextDouble();
                System.out.println("Specify the lengths of the sides of base: ");
                System.out.print("Side A: ");
                sideA = scanner.nextDouble();
                System.out.print("Side B: ");
                sideB = scanner.nextDouble();
                System.out.print("Side C: ");
                sideC = scanner.nextDouble();
                //condition
                if(sideA+sideB<=sideC || sideA+sideC<=sideB || sideB+sideC<=sideA)
                {
                    System.out.println("Triangle doesn't exist");
                }
                else
                {
                    base1 = new Triangle(sideA, sideB, sideC);
                    ThreeDim prism1 = new ThreeDim(base1, h);
                    prism1.print();
                }
                break;
            case 2:
                Square base2;
                double side;
                System.out.println("Specify the lengths of the sides of base: ");
                side = scanner.nextDouble();
                base2 = new Square(side);
                System.out.println("Specify the length of the height: ");
                h = scanner.nextDouble();
                ThreeDim prism2 = new ThreeDim(base2, h);
                prism2.print();
                break;
            case 3:
                Circle base3;
                double r;
                System.out.println("Specify the length of the radius of base: ");
                r = scanner.nextDouble();
                base3 = new Circle(r);
                System.out.println("Specify the length of the height: ");
                h = scanner.nextDouble();
                ThreeDim prism3 = new ThreeDim(base3, h);
                prism3.print();
                break;
            default:
                break;
        }
    }
    public int chooseFigure(){
        System.out.println("Choose figure: ");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. ThreeDim");
        return scanner.nextInt();
    }
    public void start() {
        while (true) {
            System.out.println("\n=== GeometryCalculator ===");
            System.out.println("1. Choose a figure and display figure information");
            System.out.println("2. Exit the program");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    figure = chooseFigure();
                    switch (figure) {
                        case 1:
                            triangleMenu();
                            break;
                        case 2:
                            squareMenu();
                            break;
                        case 3:
                            circleMenu();
                            break;
                        case 4:
                            threeDimMenu();
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Exit the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Incorrect option. Select again.");
            }
        }
    }
}
