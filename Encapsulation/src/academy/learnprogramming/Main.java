package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Player player = new Player();
//        player.name = "Lee";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Lee",200,"Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
