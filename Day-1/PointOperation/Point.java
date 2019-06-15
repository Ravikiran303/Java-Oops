class PointDemo {
    public static void main(String[] args) {
        Point point = new Point();
        point.setValues(2, 3, 4);
        System.out.println(point.getValues());

        Point point1 = new Point();
        point1.setValues(2, 3, 4);
        System.out.println(point1.getValues());

        if (point.equals(point1)) {
            System.out.println("Matched");
        } else {
            System.out.println("NotMatched");
        }
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

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Point)) {
            return false;
        }
        Point p = (Point) o;
        return p.xCordinate == this.xCordinate && p.yCordinate == this.yCordinate && p.zCordinate == this.zCordinate;
    }

    String getValues() {
        return xCordinate + "," + yCordinate + "," + zCordinate;
    }
}
