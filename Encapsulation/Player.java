class Player {
    String name;
    int health;
    String weapon;

    void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Plyaer knoked out");
        }
    }

    int healthRemaining() {
        return this.health;
    }

}