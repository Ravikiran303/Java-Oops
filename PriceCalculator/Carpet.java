class Carpet {
    int cost;

    Carpet(int cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    int getCost() {
        return cost;
    }
}