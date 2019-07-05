class Encapsulation {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "RR";
        player.health = 20;
        player.weapon = "Gun";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaing = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaing = " + player.healthRemaining());
    }
}