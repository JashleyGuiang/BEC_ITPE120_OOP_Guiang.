class Channel extends Cloth {
    private int price;
    
    public Channel(String type, int price) {
        super(type);
        this.price = price;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Cloth price: " + price);
    }
}