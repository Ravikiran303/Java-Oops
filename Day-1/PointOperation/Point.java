class PointDemo {
    public static void main(String[] args) {
        Point point = new Point();
        point.setValues(2, 3, 4);
        System.out.println(point.getValues());

        Point point1 = new Point();
        point1.setValues(2, 3, 4);
        System.out.println(point1.getValues());

        if (point.getValues().equals(point1.getValues())) {
            System.out.println("Matched");
        }
        else{
            System.out.println("Not Matched");
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

    String getValues() {
        return xCordinate + "," + yCordinate + "," + zCordinate;
    }
}

    