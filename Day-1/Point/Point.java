class PointDemo {
    public static void main(String[] args) {
        Point point = new Point();
        point.setValues(2, 3);
        System.out.println(point.getValues());
    }
}

class Point {
    int xCordinate;
    int yCordinate;

    void setValues(int x, int y) {
        xCordinate = x;
        yCordinate = y;
    }

    String getValues() {
        return xCordinate + "," + yCordinate;
    }
}