class PriceCalculator {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(8);
        Floor floor = new Floor(2, 3);
        System.out.println(carpet.getCost());
        System.out.println(floor.getArea());
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println(calculator.getTotalCost());
    }
}