class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setValues(2, 3);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setValues(3, 3);

        if (rectangle.equals(rectangle1)) {
            System.out.print("matched");
        } else {
            System.out.print("not matched");
        }
    }
}

class Rectangle {
    int length;
    int bredth;

    void setValues(int length, int bredth) {
        this.length = length;
        this.bredth = bredth;
    }

    int area() {
        return length * bredth;
    }

    int perimeter() {
        return 2 * (length + bredth);
    }

    public boolean equals(Object o) {
        Rectangle r = (Rectangle) o;
        if (r == null) {
            return false;
        }
        if (!(o instanceof Rectangle)) {
            return false;
        }
        return this.length == r.length && this.bredth == r.bredth;

    }
}