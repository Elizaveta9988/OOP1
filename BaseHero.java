public class BaseHero {
    String name;
    Integer attack, defence, damage, health, speed;

    public BaseHero(String name, int attack, int defence, int damage, int health, int speed) {
        this.name =name;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return ("Name: " + name + ", Attack:" + attack + ", Defence:" + defence + ", Damage:" + damage + ", Health:" + health + ", Speed: " + speed);


