public class Main {
    public static void main(String[] args) {

        for (ShapeType shape : ShapeType.values()) {
            double area = 0;
            double perimeter = 0;

            switch (shape) {
                case CIRCLE:
                    double circleRadius = 3.0;
                    area = shape.calculateArea(circleRadius);
                    perimeter = shape.calculatePerimeter(circleRadius);
                    break;
                case SQUARE:
                    double squareSide = 4.0;
                    area = shape.calculateArea(squareSide);
                    perimeter = shape.calculatePerimeter(squareSide);
                    break;
                case TRIANGLE:
                    double triangleBase = 5.0;
                    double triangleHeight = 6.0;
                    double triangleSide1 = 3.0;
                    area = shape.calculateArea(triangleBase, triangleHeight);
                    perimeter = shape.calculatePerimeter(triangleSide1, triangleSide1, triangleBase);
                    break;
            }
            System.out.println("Shape: " + shape);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println("-----------------------");
        }
    }
}
