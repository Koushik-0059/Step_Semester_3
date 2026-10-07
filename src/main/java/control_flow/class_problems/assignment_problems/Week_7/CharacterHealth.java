package control_flow.class_problems.assignment_problems.Week_7;

class Character {

    private int health;
    private final int maxHealth;

    Character(int maxHealth) {
        this.maxHealth = maxHealth;
        health = maxHealth;
    }

    void takeDamage(int amount) {
        health = health - amount;

        if (health < 0)
            health = 0;
    }

    void heal(int amount) {
        health = health + amount;

        if (health > maxHealth)
            health = maxHealth;
    }

    int getHealth() {
        return health;
    }
}

public class CharacterHealth {

    public static void main(String[] args) {

        Character c = new Character(100);

        c.takeDamage(30);
        System.out.println(c.getHealth());

        c.heal(50);
        System.out.println(c.getHealth());

        c.takeDamage(150);
        System.out.println(c.getHealth());
    }
}