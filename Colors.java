public enum Colors {
    RED(255, 0, 0),
    GREEN(0, 128, 0),
    BLUE(0, 0, 255),
    MAGENTA(250, 45, 208),
    CYAN(0, 183, 235);

    private int red;
    private int green;
    private int blue;

    Colors(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void printRGBValues() {
        System.out.println(name() + " - Red: " + red + ", Green: " + green + ", Blue: " + blue);
    }
}
