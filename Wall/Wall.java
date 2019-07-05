class Wall {
    int width;
    int height;

    Wall() {
        this(0, 0);
    }

    Wall(int width, int height) {
        if (this.width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (this.height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        if (this.width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        if (this.height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    int area() {
        return this.width * this.height;
    }

}