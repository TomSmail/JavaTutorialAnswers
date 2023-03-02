package BattlingFighters;

public class GameEngine {

    public void simulateBattle(Fighter first, Fighter second) {
        while (!first.isDead() && !second.isDead()) {
            System.out.println("------------------------------");
            int firstDamage = first.calculateDamage();
            int secondDamage = second.calculateDamage();
            if (firstDamage > secondDamage) {
                System.out.println(first.getName() + " hits " + second.getName() + ", stats are: ");
                second.takeDamage(2);
            } else if (firstDamage < secondDamage) {
                System.out.println(second.getName() + " hits " + first.getName() + ", stats are: ");
                first.takeDamage(2);
            } else {
                System.out.println(first.getName() + " draws with " + second.getName());
            }
            System.out.println(first.getName() + " - " + first.getType() + " - " + first.getSkill() + "; " + first.getStamina());
            System.out.println(second.getName() + " - " + second.getType() + " - " + second.getSkill() + "; " + second.getStamina());

        }
        System.out.println("------------------------------");
        if (first.isDead()) {
            System.out.println("End of battle, " + second.getName() + " - " + second.getType() + " wins!");
        } else  {
            System.out.println("End of battle, " + first.getName() + " - " + first.getType() + " wins!");
        }
    }

    public static void main(String[] args) {
        Fighter terry = new Fighter("Terry", "Jug-alo");
        Fighter terrance = new Fighter("Terrance", "Ginger Cat");
        GameEngine gameEngine = new GameEngine();
        gameEngine.simulateBattle(terrance, terry);
    }
}
