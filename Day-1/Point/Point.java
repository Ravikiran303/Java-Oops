class PointDemo {
    public static void main(String[] args) {
        Point point = new Point();
        point.setValues(2, 3, 4);
        System.out.println(point.getValues());
    }
}

class Point {
    int xCordinate;
    int yCordinate;
    int zCordinate;

    void setValues(int x, int y, int z) {
        xCordinate = x;
        yCordinate = y;
        zCordinate = z;
    }

    String getValues() {
        return xCordinate + "," + yCordinate + "," + zCordinate;
    }
}