package BattlingFighters;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Fighter {

    private RandomGenerator generator = new Random();
    private String name;
    private Integer skill;
    private Integer stamina;
    private String type;


    public Fighter(String name, String type) {
        this.name = name;
        this.type = type;
        this.skill = generator.nextInt(18);
        this.stamina = generator.nextInt(24);
    }

    // Reduce the fighter's stamina accordingly
    public void takeDamage(int damage) {
        stamina -= damage;
    }

    // Return the number of damage points to be inflicted on opponent
    public int calculateDamage() {
//        two dice means we need to calculate them separately, as 1 is not a possible result
        return skill + generator.nextInt(6) + generator.nextInt(6);
    }

//    // Calculate an attack score for the fighter using the procedure described above
//    public int calculateAttackScore() {
//
//    }

    // Determine whether fighter is still alive
    public boolean isDead() {
        return stamina <= 0;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getStamina() {
        return ("stamina: " + stamina.toString());
    }

    public String getSkill() {
        return ("skill: " + skill.toString());
    }
}
