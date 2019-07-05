class WallDemo {
    public static void main(String[] args) {
        Wall wall = new Wall();

        System.out.println(wall.getWidth());
        System.out.println(wall.getHeight());

        wall.setHeight(3);
        System.out.println(wall.area());
    }
}