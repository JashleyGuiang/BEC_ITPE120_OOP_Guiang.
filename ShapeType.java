enum ShapeType {
    CIRCLE, SQUARE, TRIANGLE;

    public double calculateArea(double... parameters) {
        switch (this) {
            case CIRCLE:
                double radius = parameters[0];
                return Math.PI * radius * radius;
            case SQUARE:
                double side = parameters[0];
                return side * side;
            case TRIANGLE:
                double base = parameters[0];
                double height = parameters[1];
                return 0.5 * base * height;
            default:
                return 0;
        }
    }
    public double calculatePerimeter(double... parameters) {
        switch (this) {
            case CIRCLE:
                double radius = parameters[0];
                return 2 * Math.PI * radius;
            case SQUARE:
                double side = parameters[0];
                return 4 * side;
            case TRIANGLE:
                double side1 = parameters[0];
                double side2 = parameters[1];
                double side3 = parameters[2];
                return side1 + side2 + side3;
            default:
                return 0;
        }
    }
}

