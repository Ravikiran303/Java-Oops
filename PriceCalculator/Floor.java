class Floor {
    int length;
    int width;

    Floor(int length, int width) {
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    int getArea() {
        return length * width;
    }

}